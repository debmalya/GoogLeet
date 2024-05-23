package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfAllSubsetsXORTotalsTest {

  SumOfAllSubsetsXORTotals sumOfAllSubsetsXORTotals = new SumOfAllSubsetsXORTotals();

  @Test
  void subsetXORSum() {
    assertEquals(6, sumOfAllSubsetsXORTotals.subsetXORSum(new int[] {1, 3}));
    assertEquals(28, sumOfAllSubsetsXORTotals.subsetXORSum(new int[] {5, 1, 6}));
    assertEquals(480, sumOfAllSubsetsXORTotals.subsetXORSum(new int[] {3, 4, 5, 6, 7, 8}));
  }
}
