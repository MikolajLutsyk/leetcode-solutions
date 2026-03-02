package org.example.LeetCode75.Queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumberOfRecentCallsTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 100, 3001, 3002},
                        new int[]{1, 2, 3, 3}
                ),
                Arguments.of(
                        new int[]{3000, 3000, 3000},
                        new int[]{1, 2, 3}
                ),
                Arguments.of(
                        new int[]{1, 3001, 6001, 9001},
                        new int[]{1, 2, 2, 2}
                ),
                Arguments.of(
                        new int[]{100, 200, 300, 400},
                        new int[]{1, 2, 3, 4}
                ),
                Arguments.of(
                        new int[]{1},
                        new int[]{1}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void recentCounter(int[] pings, int[] expected) {
        NumberOfRecentCalls.RecentCounter counter =
                new NumberOfRecentCalls.RecentCounter();

        int[] result = new int[pings.length];

        for (int i = 0; i < pings.length; i++) {
            result[i] = counter.ping(pings[i]);
        }

        assertArrayEquals(expected, result);
    }
}