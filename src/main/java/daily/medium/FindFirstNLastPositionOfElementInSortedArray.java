package daily.medium;

public class FindFirstNLastPositionOfElementInSortedArray {


    public int[] searchRange(int[] nums, int target) {
        int[] positions = new int[2];
        int startPosition = -1;
        int endPosition = -1;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target && startPosition == -1) {
                startPosition = index;
                endPosition = index;
            } else if (nums[index] == target && startPosition > -1) {
                endPosition = index;
            } else if (startPosition > -1 && endPosition > -1) {
                break;
            }
        }
        positions[0] = startPosition;
        positions[1] = endPosition;
        return positions;
    }
}
