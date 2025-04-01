package org.example.LeetCode75.TwoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("", "ahbgdc", true),
                Arguments.of("aaaaaa", "bbaaaa", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testIsSubsequence(String s, String t, boolean expected) {
        assertEquals(expected, IsSubsequence.isSubsequence(s, t));
    }
}