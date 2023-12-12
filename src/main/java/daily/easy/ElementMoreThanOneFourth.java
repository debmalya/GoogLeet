package daily.easy;

import java.util.HashMap;
import java.util.Map;

public class ElementMoreThanOneFourth {

    public int findSpecialInteger(int[] arr) {
        int q = arr.length / 4;
        for (int i = 0; i < arr.length - q; i++) {
            if (arr[i] == arr[i + q])
                return arr[i];
        }
        return -1;
    }

    public int findSpecialInteger0(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int threshold = arr.length / 4;
        int result = 0;
        for (int num : arr) {
            int count = frequency.getOrDefault(num, 0);
            count++;
            frequency.put(num, count);
            if (count > threshold) {
                result = num;
                break;
            }
        }
        return result;
    }
}
