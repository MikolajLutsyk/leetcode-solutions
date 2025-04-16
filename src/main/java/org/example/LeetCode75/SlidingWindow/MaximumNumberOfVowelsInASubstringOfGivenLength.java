package org.example.LeetCode75.SlidingWindow;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static int maxVowels(String s, int k) {
        int currentWindowVowels = 0;
        int windowStart = 0;

        boolean[] isVowel = new boolean[256];
        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }

        for (int i = 0; i < k; i++) {
            if (isVowel[s.charAt(i)]) {
                currentWindowVowels++;
            }
        }

        int maxVowels = currentWindowVowels;

        for (int windowEnd = k; windowEnd < s.length(); windowEnd++) {
            if (isVowel[s.charAt(windowEnd)]) {
                currentWindowVowels++;
            }
            if (isVowel[s.charAt(windowStart)]) {
                currentWindowVowels--;
            }
            windowStart++;
            maxVowels = Math.max(maxVowels, currentWindowVowels);
        }
        return maxVowels;
    }
}
