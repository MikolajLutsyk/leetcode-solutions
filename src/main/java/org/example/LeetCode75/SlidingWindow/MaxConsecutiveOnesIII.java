package org.example.LeetCode75.SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static int largestOnes(int[] nums, int k) {
        int max = 0;
        int start = 0, end = 0;
        int zeroCount = nums[0] == 0 ? 1 : 0;

        while (end < nums.length) {
            if (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
            if (end < nums.length && nums[end] == 0) {
                zeroCount++;
            }
        }
        return max;
    }
}
