package hard;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumTasksAssignment {
  /**
   * You have n tasks and m workers. Each task has a strength requirement stored in a 0-indexed
   * integer array tasks, with the ith task requiring tasks[i] strength to complete. The strength of
   * each worker is stored in a 0-indexed integer array workers, with the jth worker having
   * workers[j] strength. Each worker can only be assigned to a single task and must have a strength
   * greater than or equal to the task's strength requirement (i.e., workers[j] >= tasks[i]).
   *
   * <p>Additionally, you have pills magical pills that will increase a worker's strength by
   * strength. You can decide which workers receive the magical pills, however, you may only give
   * each worker at most one magical pill.
   *
   * <p>Given the 0-indexed integer arrays tasks and workers and the integers pills and strength,
   * return the maximum number of tasks that can be completed.
   */
  private int[] dorayakiTasks;

  private int[] gadgetWorkers;
  private int gadgetBoost;
  private int magicPills;
  private int totalTasks;
  private int totalGadgets;

  public int maxTaskAssign(
      int[] dorayakiTasks, int[] gadgetWorkers, int magicPills, int gadgetBoost) {
    Arrays.sort(dorayakiTasks);
    Arrays.sort(gadgetWorkers);
    this.dorayakiTasks = dorayakiTasks;
    this.gadgetWorkers = gadgetWorkers;
    this.gadgetBoost = gadgetBoost;
    this.magicPills = magicPills;
    totalTasks = dorayakiTasks.length;
    totalGadgets = gadgetWorkers.length;

    int nobita = 0, suneo = Math.min(totalGadgets, totalTasks);
    while (nobita < suneo) {
      int mid = (nobita + suneo + 1) / 2;
      if (check(mid)) {
        nobita = mid;
      } else {
        suneo = mid - 1;
      }
    }
    return nobita;
  }

  private boolean check(int x) {
    int taskIndex = 0;
    Deque<Integer> taskQueue = new ArrayDeque<>();
    int remainingPills = magicPills;

    for (int workerIndex = totalGadgets - x; workerIndex < totalGadgets; ++workerIndex) {
      while (taskIndex < x
          && dorayakiTasks[taskIndex] <= gadgetWorkers[workerIndex] + gadgetBoost) {
        taskQueue.offer(dorayakiTasks[taskIndex++]);
      }
      if (taskQueue.isEmpty()) {
        return false;
      }
      if (taskQueue.peekFirst() <= gadgetWorkers[workerIndex]) {
        taskQueue.pollFirst();
      } else if (remainingPills == 0) {
        return false;
      } else {
        --remainingPills;
        taskQueue.pollLast();
      }
    }
    return true;
  }
}
