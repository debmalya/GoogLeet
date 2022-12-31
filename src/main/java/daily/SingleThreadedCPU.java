package daily;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SingleThreadedCPU {

	/**
	 * You are given n​​​​​​ tasks labeled from 0 to n - 1 represented by a 2D
	 * integer array tasks, where tasks[i] = [enqueueTimei, processingTimei] means
	 * that the i​​​​​​th​​​​ task will be available to process at enqueueTimei and
	 * will take processingTimei to finish processing.
	 * 
	 * You have a single-threaded CPU that can process at most one task at a time
	 * and will act in the following way:
	 * 
	 * If the CPU is idle and there are no available tasks to process, the CPU
	 * remains idle. If the CPU is idle and there are available tasks, the CPU will
	 * choose the one with the shortest processing time. If multiple tasks have the
	 * same shortest processing time, it will choose the task with the smallest
	 * index. Once a task is started, the CPU will process the entire task without
	 * stopping. The CPU can finish a task then start a new one instantly. Return
	 * the order in which the CPU will process the tasks.
	 * 
	 * @param tasks
	 * @return the order in which the CPU will process the tasks.
	 */

	public int[] getOrder(int[][] tasks) {

		// Sort based on min task processing time or min task index.
		// Store enqueue time, processing time, task index.
		PriorityQueue<int[]> nextTask = new PriorityQueue<int[]>(
				(a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : (a[2] - b[2])));

		// Store task enqueue time, processing time, index.
		int sortedTasks[][] = new int[tasks.length][3];
		for (int i = 0; i < tasks.length; ++i) {
			sortedTasks[i][0] = tasks[i][0];
			sortedTasks[i][1] = tasks[i][1];
			sortedTasks[i][2] = i;
		}

		Arrays.sort(sortedTasks, (a, b) -> Integer.compare(a[0], b[0]));
		int tasksProcessingOrder[] = new int[tasks.length];

		long currTime = 0;
		int taskIndex = 0;
		int ansIndex = 0;

		// Stop when no tasks are left in array and heap.
		while (taskIndex < tasks.length || !nextTask.isEmpty()) {
			if (nextTask.isEmpty() && currTime < sortedTasks[taskIndex][0]) {
				// When the heap is empty, try updating currTime to next task's enqueue time.
				currTime = sortedTasks[taskIndex][0];
			}

			// Push all the tasks whose enqueueTime <= currtTime into the heap.
			while (taskIndex < tasks.length && currTime >= sortedTasks[taskIndex][0]) {
				nextTask.add(sortedTasks[taskIndex]);
				++taskIndex;
			}

			int processTime = nextTask.peek()[1];
			int index = nextTask.peek()[2];
			nextTask.remove();

			// Complete this task and increment currTime.
			currTime += processTime;
			tasksProcessingOrder[ansIndex++] = index;
		}

		return tasksProcessingOrder;
	}

}
