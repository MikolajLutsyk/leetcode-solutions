package org.example.LeetCode75.SlidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2, 6),
                Arguments.of(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3, 10),
                //edge case
                Arguments.of(new int[] {0,0,1,1,1,0,0}, 0, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void maxVowels(int[] nums, int k, int expected) {
        int result = MaxConsecutiveOnesIII.largestOnes(nums, k);
        assertEquals(expected, result);
    }
}