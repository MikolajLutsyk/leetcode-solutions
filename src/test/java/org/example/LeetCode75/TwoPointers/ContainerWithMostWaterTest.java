package org.example.LeetCode75.TwoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testMaxArea(int[] heights, int expected) {
        assertEquals(expected, ContainerWithMostWater.maxArea(heights));
    }
}