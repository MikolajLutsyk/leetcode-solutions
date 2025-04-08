package org.example.LeetCode75.SlidingWindow;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double currentMaximum = 0;
        double currentWindowSum = 0;
        int windowStart = 0;
        int windowEnd = k;


        for (int i = 0; i < k; i++){
            currentWindowSum += nums[i];
        }
        currentMaximum = currentWindowSum / k;

        while (windowEnd < nums.length){
            currentWindowSum += nums[windowEnd];
            currentWindowSum -= nums[windowStart];
            windowEnd++;
            windowStart++;
            currentMaximum = Math.max(currentMaximum, currentWindowSum / k);
        }

        return currentMaximum;
    }
}
