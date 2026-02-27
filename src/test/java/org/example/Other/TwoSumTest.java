package org.example.Other;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9),
                Arguments.of(new int[]{3, 2, 4}, 6),
                Arguments.of(new int[]{3, 3}, 6),
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, -8),
                Arguments.of(new int[]{0, 4, 3, 0}, 0),
                Arguments.of(new int[]{5, 5, 5, 5}, 10),
                Arguments.of(new int[]{1, 1, 1, 2, 2}, 3),
                Arguments.of(new int[]{-3, 4, 3, 90}, 0),
                Arguments.of(new int[]{1, -2, 5, -3}, -1),
                Arguments.of(new int[]{7, 2, 13, 11}, 9),
                Arguments.of(new int[]{17, 18, 3, 6}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void twoSum(int[] nums, int target) {
        int[] result = TwoSum.twoSum(nums, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertNotEquals(result[0], result[1]);
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }
}