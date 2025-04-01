package org.example.LeetCode75.TwoPointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class MoveZeroesTest {

    static Stream<Object[]> provideTestCases() {
        return Stream.of(
                new Object[]{new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}},
                new Object[]{new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}},
                new Object[]{new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}},
                new Object[]{new int[]{1, 2, 3, 0, 0}, new int[]{1, 2, 3, 0, 0}},
                new Object[]{new int[]{0}, new int[]{0}},
                new Object[]{new int[]{5}, new int[]{5}},
                new Object[]{new int[]{4, 0, 5, 0, 6, 0, 7, 8, 9, 0}, new int[]{4, 5, 6, 7, 8, 9, 0, 0, 0, 0}}
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testMoveZeroes(int[] input, int[] expected) {
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);
    }
}