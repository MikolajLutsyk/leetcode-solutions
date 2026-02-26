package org.example.LeetCode75.SlidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class  LongestSubrarrayOf1sAfterDeletingOneElementTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,1,0,1}, 3),
                Arguments.of(new int[]{0,1,1,1,0,1,1,0,1}, 5),
                Arguments.of(new int[]{1,1,1}, 2),
                Arguments.of(new int[]{0,0,0}, 0),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{1,0,1,1,1,0,1,1,0,1,1}, 5),
                Arguments.of(new int[]{1,1,0,0,1,1,1,0,1}, 4),
                Arguments.of(new int[]{1,1,1,1,1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void longestSubarray(int[] nums, int expected) {
        assertEquals(expected, LongestSubrarrayOf1sAfterDeletingOneElement.longestSubarray(nums));
    }
}