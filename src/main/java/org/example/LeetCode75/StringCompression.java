package org.example.LeetCode75;

public class StringCompression {
    public static int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }

        return write;
    }
}
