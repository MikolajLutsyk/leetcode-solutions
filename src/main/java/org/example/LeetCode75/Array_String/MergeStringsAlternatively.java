package org.example.LeetCode75.Array_String;

public class MergeStringsAlternatively {
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder builder = new StringBuilder();

        int iword1 = 0, iword2 = 0;

        boolean flag = true;

        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if ((flag && iword1 < word1.length() && iword2 < word2.length()) || (iword1 < word1.length() && iword2 >= word2.length())) {
                builder.append(word1.charAt(iword1));
                iword1++;
            } else if(iword2 < word2.length()) {
                builder.append(word2.charAt(iword2));
                iword2++;
            }
            flag = !flag;
        }

        return builder.toString();
    }
}
