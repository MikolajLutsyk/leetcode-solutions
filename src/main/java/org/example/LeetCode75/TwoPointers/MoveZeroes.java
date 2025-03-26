package org.example.LeetCode75.TwoPointers;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int replacementIndex = 0;
        if (nums.length == 1){
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[replacementIndex++] = nums[i];
            }
        }
        for (int i = replacementIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
