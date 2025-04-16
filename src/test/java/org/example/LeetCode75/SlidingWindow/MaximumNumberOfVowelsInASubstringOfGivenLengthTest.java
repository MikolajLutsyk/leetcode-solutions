package org.example.LeetCode75.SlidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                // Basic cases
                Arguments.of("abciiidef", 3, 3),
                Arguments.of("aeiou", 2, 2),
                Arguments.of("leetcode", 3, 2),
                Arguments.of("xyz", 1, 0),
                // Edge cases
                Arguments.of("a", 1, 1),
                Arguments.of("b", 1, 0),
                Arguments.of("aaaaa", 5, 5),
                Arguments.of("abcde", 5, 2),
                Arguments.of("AaEeIiOoUu", 3, 3),
                Arguments.of("", 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void maxVowels(String s, int k, int expected) {
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(expected, result);
    }
}