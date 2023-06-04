package daily;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    public void moveZeroes(int[] nums) {

        List<Integer> nonZeros = new ArrayList<>();
        for (int num:nums){
            if (num != 0){
                nonZeros.add(num);
            }
        }

        int count = 0;
        for (int num: nonZeros){
            nums[count] = nonZeros.get(count);
            count++;
        }
        while (count < nums.length){
            nums[count] = 0;
            count++;
        }
    }
}
