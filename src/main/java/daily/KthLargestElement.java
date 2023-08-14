package daily;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        for (int i = 0; i < nums.length; ++i) {

            // Insert elements into
            // the priority queue
            heap1.add(nums[i]);

            // If size of the priority
            // queue exceeds k
            if (heap1.size() > k) {
                heap1.remove();
            }

        }
        return heap1.peek();
    }
}
