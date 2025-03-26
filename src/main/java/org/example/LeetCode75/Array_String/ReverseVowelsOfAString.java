package org.example.LeetCode75.Array_String;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";

        List<Character> charList = s.chars()
                .mapToObj(c -> (char) c)
                .filter(x -> vowels.contains(x.toString()))
                .collect(Collectors.toList());

        Collections.reverse(charList);

        char[] chars = s.toCharArray();
        int vowelIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(String.valueOf(chars[i]))) {
                chars[i] = charList.get(vowelIndex);
                vowelIndex++;
            }
        }

        return new String(chars);
    }
}
