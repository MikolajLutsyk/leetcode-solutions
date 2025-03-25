package org.example.LeetCode75;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String b = s.replaceAll("\\s{2,}", " ").trim();
        List<String> list = Arrays.asList(b.split(" "));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
