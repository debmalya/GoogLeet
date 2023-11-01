import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Irrigation {
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    private static final int[] ddx = {1, -1, -1, 1};
    private static final int[] ddy = {1, 1, -1, -1};

    public static void main(String[] args) throws Exception {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

            int sizeOfGrid = Integer.parseInt(in.readLine());
            int connectorCost = Integer.parseInt(in.readLine());
            int P = Integer.parseInt(in.readLine());
            int T = Integer.parseInt(in.readLine());
            int Z = Integer.parseInt(in.readLine());
            int cost = 0;

            int[][] grid = new int[sizeOfGrid][sizeOfGrid];

            List<Integer> plantLocation = new ArrayList<>();
            List<Integer> waterSource = new ArrayList<>();
            List<Integer> wetPlants = new ArrayList<>();
            List<Integer> pipeEndsAt = new ArrayList<>();
            List<Integer> pipeStartsAt = new ArrayList<>();

            // Read the grid
            for (int r = 0; r < sizeOfGrid; r++) {
                for (int c = 0; c < sizeOfGrid; c++) {
                    grid[r][c] = Integer.parseInt(in.readLine());
                    int position = r * sizeOfGrid + c;
                    if (grid[r][c] == 1) {
                        waterSource.add(position);
                    } else if (grid[r][c] == 2) {
                        plantLocation.add(position);
                    }
                }
            }

            List<String> output = new ArrayList<>();


            for (int eachWaterSource : waterSource) {
                int r = eachWaterSource / sizeOfGrid;
                int c = eachWaterSource % sizeOfGrid;

                // Water source
                for (int d = 0; d < 4; d++) {
                    int r2 = r + dx[d];
                    int c2 = c + dy[d];
                    int validr = -1;
                    int validc = -1;
                    while (r2 >= 0 && r2 < sizeOfGrid && c2 >= 0 && c2 < sizeOfGrid && grid[r2][c2] == 0) {
                        validr = r2;
                        validc = c2;
                        r2 += dx[d];
                        c2 += dy[d];
                    }
                    if (isNeighbouringPlant(grid, validr, validc, wetPlants)) {
                        output.add("P " + (r) + " " + (c) + " " + (validr) + " " + (validc));
                        output.add("S " + (validr) + " " + (validc));
                        grid[validr][validc] = 3;
                        pipeEndsAt.add(validr * sizeOfGrid + validc);
                        pipeStartsAt.add(r * sizeOfGrid + c);

                        if (r == validr) {
                            int start = Math.min(c, validc);
                            int end = Math.max(c, validc);
                            for (int i = start; i <= end; i++) {
                                if (grid[r][i] == 0) {
                                    grid[r][i] = 4;
                                }
                            }
                        } else {
                            int start = Math.min(r, validr);
                            int end = Math.max(r, validr);
                            for (int i = start; i <= end; i++) {
                                if (grid[i][validc] == 0) {
                                    grid[i][validc] = 4;
                                }
                            }
                        }
                    }
                }

            }

            plantLocation.removeAll(wetPlants);
            checkDryPlants(grid, plantLocation, output);
            System.out.println(output.size());
            for (String s : output) {
                System.out.println(s);
            }
            System.out.flush();
            System.err.println("Dry plant locations :" + plantLocation);
            System.err.println("Pipe starts at :" + pipeStartsAt);
            System.err.println("Pipe ends at :" + pipeEndsAt);
            for (int row = 0; row < sizeOfGrid; row++) {
                System.err.println(Arrays.toString(grid[row]));
            }

        }
    }


    private static boolean isNeighbouringPlant(int[][] grid, int row, int col, List<Integer> wetPlants) {
        boolean isPlant = false;
        int N = grid.length;
        for (int d = 0; d < 4; d++) {
            int r2 = row + dx[d];
            int c2 = col + dy[d];
            if (r2 >= 0 && r2 < N && c2 >= 0 && c2 < N && grid[r2][c2] == 2) {
                isPlant = true;
                wetPlants.add(r2 * N + c2);
            }
        }
        return isPlant;
    }

    private static void extendPipe(int[][] grid, List<Integer> dryPlants, List<Integer> pipeEnding) {
        int N = grid.length;
        for (int dryPosition : dryPlants) {
            var pipePosition = getNearestPipeEnding(dryPosition, pipeEnding, N);
            connect(dryPosition, pipePosition, grid, pipeEnding);
        }
    }

    public static void connect(int dryPosition, int pipePosition, int[][] grid, List<Integer> pipeEnding) {
    }

    public static int getNearestPipeEnding(int dryPosition, List<Integer> pipeEnding, int gridSize) {
        int nearestPosition = 0;
        double distance = 0.00d;
        int plantRow = dryPosition / gridSize;
        int plantCol = dryPosition % gridSize;
        for (int end : pipeEnding) {
            int row = end / gridSize;
            int col = end % gridSize;
            double currDist = Math.sqrt(Math.pow((plantRow - row), 2) + Math.pow((plantCol - col), 2));
            if (distance == 0.00d) {
                distance = currDist;
                nearestPosition = end;
            } else if (currDist < distance) {
                distance = currDist;
                nearestPosition = end;
            }
        }
        return nearestPosition;
    }

    private static void checkDryPlants(int[][] grid, List<Integer> dryPlants, List<String> output) {
        int N = grid.length;
        for (int dryPosition : dryPlants) {
            int row = dryPosition / N;
            int col = dryPosition % N;
            for (int d = 0; d < 4; d++) {
                int r2 = row + ddx[d];
                int c2 = col + ddy[d];
                if (r2 >= 0 && r2 < N && c2 >= 0 && c2 < N && grid[r2][c2] == 3) {
                    int c1;
                    if (d == 0 || d == 1) {
                        c1 = c2 - 1;
                    } else {
                        c1 = c2 + 1;
                    }
                    if (grid[r2][c1] == 0) {
                        System.err.println("Diagonal detection :" + r2 + " ," + c1 + " for " + row + "," + col + " d " + d + " sprinkle at " + r2 + "," + c2);
                        output.add("P " + (r2) + " " + (c2) + " " + (r2) + " " + (c1));
                        output.add("S " + (r2) + " " + (c1));
                        grid[r2][c1] = 3;
                    }
                }
            }
        }

    }
}
