package org.example.LeetCode75;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxInt = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(c -> c + extraCandies >= maxInt).collect(Collectors.toList());
    }
}
