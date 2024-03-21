package daily.medium;

public class TaskScheduler {
    /**
     * You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n.
     * Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint:
     * identical tasks must be separated by at least n intervals due to cooling time.
     * <p>
     * ​Return the minimum number of intervals required to complete all tasks.
     *
     * @param tasks
     * @param interval
     * @return
     */
    public int leastInterval(char[] tasks, int interval) {
        int[] map = new int[26];
        for (char c : tasks) {
            map[c - 'A']++;
        }

        int max = 0;
        int count = 0;
        for (int i : map) {
            if (i > max) {
                max = i;
                count = 1;
            } else if (i == max) {
                count++;
            }
        }

        int partCount = max - 1;
        int partLength = interval - (count - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * count;
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;

    }
}
