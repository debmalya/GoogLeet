package hard;

import java.util.Arrays;

public class NumbersOfFlowerInFullBloom {
    /**
     * You are given a 0-indexed 2D integer array flowers, where flowers[i] = [starti, endi] means the ith flower will
     * be in full bloom from start-i to end-i (inclusive). You are also given a 0-indexed integer array people of size n,
     * where people[i] is the time that the ith person will arrive to see the flowers.
     *
     * @param flowers 2D integer array.
     * @param people  integer array.
     * @return an integer array answer of size n, where answer[i] is the number of flowers
     * that are in full bloom when the ith person arrives.
     */

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] res = new int[people.length];

        for (int i = 0; i < people.length; i++) {
            int t = people[i];
            int started = binarySearchUpperBound(start, t);
            int ended = binarySearchLowerBound(end, t);
            res[i] = started - ended;
        }

        return res;
    }

    private int binarySearchUpperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int binarySearchLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int[] fullBloomFlowers0(int[][] flowers, int[] people) {
        int[] answer = new int[people.length];

        int max = Integer.MIN_VALUE;

        for (int[] each : flowers) {
            if (each.length > 1 && each[1] > max) {
                max = each[1];
            }
        }

        if (max > -1) {


            int[] flowerTime = new int[max];


            for (int[] each : flowers) {

                for (int index = each[0]; index <= each[1]; index++) {
                    flowerTime[index - 1]++;
                }
            }

            for (int index = 0; index < people.length; index++) {
                if (people[index] - 1 < flowerTime.length) {
                    answer[index] = flowerTime[people[index] - 1];
                } else {
                    answer[index] = 0;
                }
            }
        }

        return answer;
    }
}
