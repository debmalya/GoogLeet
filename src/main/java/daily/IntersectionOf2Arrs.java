package daily;

import java.util.*;

public class IntersectionOf2Arrs {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> occurrence = new HashMap<>();
        Arrays.sort(nums2);
        List<Integer> diff = new ArrayList<>();

        for (int num1: nums1){
            Integer position = occurrence.get(num1);
            int index = -1;
            if (position == null){
                index = Arrays.binarySearch(nums2, num1);
            }else {
                index = Arrays.binarySearch(nums2,position + 1, nums2.length, num1);
            }

            if (index > -1){
                diff.add(num1);
                occurrence.put(num1,index);
            }

        }


        return diff.stream().map(i -> (i == null ? 0 : i))
                .mapToInt(Integer::intValue).toArray();

    }
}
