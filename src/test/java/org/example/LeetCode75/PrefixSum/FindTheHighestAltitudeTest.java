package org.example.LeetCode75.PrefixSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{-5,1,5,0,-7}, 1),
                Arguments.of(new int[]{-4,-3,-2,-1,4,3,2}, 0),
                Arguments.of(new int[]{1,2,3,4,5}, 15),
                Arguments.of(new int[]{-1,-2,-3,-4}, 0),
                Arguments.of(new int[]{0,0,0,0}, 0),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-5}, 0),
                Arguments.of(new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void largestAltitude(int[] gain, int expected) {
        assertEquals(expected, FindTheHighestAltitude.largestAltitude(gain));
    }
}