package org.example.LeetCode75.PrefixSum;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for(int currentGain : gain){
            currentAltitude += currentGain;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}