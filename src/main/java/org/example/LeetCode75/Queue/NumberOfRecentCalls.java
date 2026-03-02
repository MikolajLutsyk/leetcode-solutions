package org.example.LeetCode75.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static class RecentCounter {
        public Queue<Integer> recents;
        public RecentCounter() {
            recents = new LinkedList<>();
        }
        public int ping(int t) {
            recents.add(t);
            while (recents.peek() < t - 3000) {
                recents.poll();
            }
            return recents.size();
        }
    }
}
