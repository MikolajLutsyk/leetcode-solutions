package org.example.LeetCode75.TwoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfKSumPairsTest {

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 5, 2),
                Arguments.of(new int[]{3, 1, 3, 4, 3}, 6, 1),
                Arguments.of(new int[]{1, 1, 1, 1}, 2, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 7, 3),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 9, 4),
                Arguments.of(new int[]{5, 5, 5, 5}, 10, 2),
                Arguments.of(new int[]{10, 20, 30, 40, 50}, 100, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 1, 2, 3, 4}, 5, 4),
                Arguments.of(new int[]{}, 5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testMaxOperations(int[] nums, int k, int expected) {
        assertEquals(expected, MaxNumberOfKSumPairs.maxOperations(nums, k));
    }
}