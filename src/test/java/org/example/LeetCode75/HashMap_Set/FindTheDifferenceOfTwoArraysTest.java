package org.example.LeetCode75.HashMap_Set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceOfTwoArraysTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3}, new int[]{2,4,6}, Arrays.asList(Arrays.asList(1,3), Arrays.asList(4,6))),
                Arguments.of(new int[]{1,2,3,3}, new int[]{1,1,2,2}, Arrays.asList(Arrays.asList(3), Arrays.asList())),
                Arguments.of(new int[]{}, new int[]{1,2,3}, Arrays.asList(Arrays.asList(), Arrays.asList(1,2,3))),
                Arguments.of(new int[]{1,2,3}, new int[]{}, Arrays.asList(Arrays.asList(1,2,3), Arrays.asList())),
                Arguments.of(new int[]{}, new int[]{}, Arrays.asList(Arrays.asList(), Arrays.asList())),
                Arguments.of(new int[]{1,1,2,2}, new int[]{2,2,3,3}, Arrays.asList(Arrays.asList(1), Arrays.asList(3))),
                Arguments.of(new int[]{1,2}, new int[]{3,4}, Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4))),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2,3}, Arrays.asList(Arrays.asList(), Arrays.asList())),
                Arguments.of(new int[]{1}, new int[]{2}, Arrays.asList(Arrays.asList(1), Arrays.asList(2))),
                Arguments.of(new int[]{1}, new int[]{1}, Arrays.asList(Arrays.asList(), Arrays.asList())),
                Arguments.of(new int[]{-1,-2,-3}, new int[]{-2,-3,-4}, Arrays.asList(Arrays.asList(-1), Arrays.asList(-4))),
                Arguments.of(new int[]{-1,0,1}, new int[]{0,2,3}, Arrays.asList(Arrays.asList(-1,1), Arrays.asList(2,3))),
                Arguments.of(new int[]{3,2,1}, new int[]{6,4,2}, Arrays.asList(Arrays.asList(1,3), Arrays.asList(4,6)))
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findDifference(int[] nums1, int[] nums2, List<List<Integer>> expected) {
        FindTheDifferenceOfTwoArrays finder = new FindTheDifferenceOfTwoArrays();
        List<List<Integer>> result = finder.findDifference(nums1, nums2);

        result.get(0).sort(Integer::compareTo);
        result.get(1).sort(Integer::compareTo);
        expected.get(0).sort(Integer::compareTo);
        expected.get(1).sort(Integer::compareTo);

        assertEquals(expected, result);
    }
}