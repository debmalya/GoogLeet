package daily.easy;


public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int size = nums.length;
    int count = 0;
    var writeIndex = 0;

    for (int readIndex = 0; readIndex < size; readIndex++) {
      if (nums[readIndex] == val) {
        if (readIndex + 1 < size && writeIndex < size) {
          nums[writeIndex] = nums[readIndex + 1];
        }
        count++;
      } else {
        nums[writeIndex] = nums[readIndex];
        writeIndex++;
      }
    }


    return size - count;
  }
}
