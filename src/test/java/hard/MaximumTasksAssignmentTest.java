package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTasksAssignmentTest {

  @Test
  void maxTaskAssign() {
    MaximumTasksAssignment maximumTasksAssignment = new MaximumTasksAssignment();
    int[] tasks = {3, 2, 1};
    int[] workers = {0, 3, 3};
    int pills = 1;
    int strength = 1;
    int expected = 3;
    int actual = maximumTasksAssignment.maxTaskAssign(tasks, workers, pills, strength);
    assertEquals(expected, actual);
  }
}
