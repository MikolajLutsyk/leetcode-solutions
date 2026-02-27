package org.example.LeetCode75.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveStarsFromAString {
    public String removeStars(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' && !deque.isEmpty()) {
                deque.pop();
            } else if (c != '*') {
                deque.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.pollLast());
        }
        return sb.toString();
    }
}