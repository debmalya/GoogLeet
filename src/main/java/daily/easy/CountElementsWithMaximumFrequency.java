package daily.easy;


public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[100];
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            frequency[num - 1]++;
            if (frequency[num - 1] > max) {
                max = frequency[num - 1];
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == max) {
                count += frequency[i];
            }
        }
        return count;
    }
}
