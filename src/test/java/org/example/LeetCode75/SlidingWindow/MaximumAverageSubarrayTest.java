package org.example.LeetCode75.SlidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                // Basic test cases
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[]{5}, 1, 5.0),
                Arguments.of(new int[]{0, 1, 1, 3, 3}, 4, 2.0),

                // All positive numbers
                Arguments.of(new int[]{4, 2, 1, 6, 2}, 3, 3.0),

                // All negative numbers
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, 2, -1.5),

                // Mixed positive and negative numbers
                Arguments.of(new int[]{1, -2, 3, -4, 5, -6}, 3, 1.33333),

                // k equals array length
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, 3.0),

                // Large numbers
                Arguments.of(new int[]{100000, -10000, 50000, -20000, 30000}, 2, 45000.0),

                // k=1 (minimum window size)
                Arguments.of(new int[]{-1, -2, 3, 4, -5}, 1, 4.0),

                // Repeated numbers
                Arguments.of(new int[]{7, 7, 7, 7, 7, 7}, 3, 7.0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findMaxAverage(int[] nums, int k, double expected) {
        double result = MaximumAverageSubarray.findMaxAverage(nums, k);
        assertEquals(expected, result, 0.00001);
    }
}