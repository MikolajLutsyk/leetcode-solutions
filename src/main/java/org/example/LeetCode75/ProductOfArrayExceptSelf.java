package org.example.LeetCode75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length, left = 1, right = 1;
        int[] result = new int[l];

        Arrays.fill(result, 1);

        for (int i = 0; i < l; i++) {
            result[i] *= left;
            left *= nums[i];
            result[l - 1 - i] *= right;
            right *= nums[l - 1 - i];
        }

        return result;
    }
}

//Complexity - O(n)
