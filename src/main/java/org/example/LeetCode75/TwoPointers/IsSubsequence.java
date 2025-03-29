package org.example.LeetCode75.TwoPointers;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int currentIndex = t.indexOf(s.charAt(0));

        if(currentIndex == -1){
            return false;
        }
        for(int i=1; i<s.length(); i++){
            if(t.indexOf(s.charAt(i), currentIndex + 1) != -1) {
                currentIndex = t.indexOf(s.charAt(i), currentIndex + 1);
                continue;
            }
            return false;
        }
        return true;
    }
}

