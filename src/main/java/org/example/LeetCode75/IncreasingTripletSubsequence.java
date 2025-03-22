package org.example.LeetCode75;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > mid) {
                return true;
            }
            if (num < min) {
                min = num;
            } else if (num > min && num < mid) {
                mid = num;
            }
        }
        return false;
    }
}
