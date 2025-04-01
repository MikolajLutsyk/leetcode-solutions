package org.example.LeetCode75.TwoPointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int res = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                res++;
                left++;
                right--;
            }else if (sum < k){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}
