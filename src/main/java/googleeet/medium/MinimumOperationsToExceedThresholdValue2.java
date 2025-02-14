package googleeet.medium;

import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValue2 {
  /**
   * You are given a 0-indexed integer array nums, and an integer k.
   *
   * <p>In one operation, you will:
   *
   * <p>Take the two smallest integers x and y in nums. Remove x and y from nums. Add min(x, y) * 2
   * + max(x, y) anywhere in the array. Note that you can only apply the described operation if nums
   * contains at least two elements.
   *
   * <p>Return the minimum number of operations needed so that all elements of the array are greater
   * than or equal to k.
   *
   * @param nums - integer array.
   * @param k - integer value to check against.
   * @return - minimum number of operations needed so that all elements of the array are greater
   *     than or equal to k.
   *     <p>The input is generated such that an answer always exists. That is, there exists some
   *     sequence of operations after which all elements of the array are greater than or equal to
   *     k.
   */
  public int minOperations(int[] nums, int k) {
      PriorityQueue<Long> nm=new PriorityQueue<>();
      for(int i:nums)
      {
        nm.offer((long)i);
      }
      int count=0;
      while(!nm.isEmpty() && nm.size()>1)
      {
        long val1=nm.poll();
        long val2=nm.poll();
        //System.out.println(val1+" "+val2);
        if(val1<k || val2<k)
        {
          long cal= Math.min(val1,val2) *(long)2 + Math.max(val1,val2);
          nm.offer(cal);
          count++;
        }
        else
        {
          nm.offer(val1);
          nm.offer(val2);
          break;
        }
      }
      return count;
    }
}
