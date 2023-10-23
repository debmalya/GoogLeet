package hard;

public class ReachingPoints {
    /**
     * Given four integers sx, sy, tx, and ty,
     * return true if it is possible to convert the point (sx, sy) to the point (tx, ty) through some operations, or false otherwise.
     * <p>
     * The allowed operation on some point (x, y) is to convert it to either (x, x + y) or (x + y, y).
     *
     * @param sx x coordinate of the first point.
     * @param sy y coordinate of the first point.
     * @param tx x coordinate of the second point.
     * @param ty y coordinate of the second point.
     * @return true if it is possible to convert the point (sx, sy) to the point (tx, ty).
     */
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (sx < tx && sy < ty) {
            if (tx > ty) {
                tx = tx % ty;
            } else {
                ty = ty % tx;
            }
        }
        if (sx == tx && sy <= ty) {
            return (ty - sy) % tx == 0;
        } else {
            return sy == ty && sx <= tx && (tx - sx) % ty == 0;
        }
    }

    public boolean reachingPoints0(int sx, int sy, int tx, int ty) {
        while (sx <= tx && sy <= ty) {
            if (sx == tx && sy == ty) {
                return true;
            }
            if (sx + sy == ty) {
                sy += sx;
            } else if (sx + sy == tx) {
                sx += sy;
            } else if (sx + sy <= ty) {
                sy += sx;
            } else if (sx + sy <= tx) {
                sx += sy;
            } else {
                break;
            }

        }
        return false;
    }

}
