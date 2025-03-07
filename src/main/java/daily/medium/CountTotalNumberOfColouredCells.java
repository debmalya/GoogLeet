package daily.medium;

public class CountTotalNumberOfColouredCells {
  /**
   * There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a
   * positive integer n, indicating that you must do the following routine for n minutes:
   *
   * <p>At the first minute, color any arbitrary unit cell blue. Every minute thereafter, color blue
   * every uncolored cell that touches a blue cell.
   *
   * @param n positive integer.
   * @return
   */
  public long coloredCells(int n) {
    long sum=1; // Initial number of colored cells
    for(int i=2; i<=n; i++){
      sum+=(i-1)*4; // Increment by 4 times the previous level
    }
    return sum;
  }
}
