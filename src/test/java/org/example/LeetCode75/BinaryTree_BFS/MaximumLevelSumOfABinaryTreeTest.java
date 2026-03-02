package org.example.LeetCode75.BinaryTree_BFS;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLevelSumOfABinaryTreeTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new Object[]{1,7,0,7,-8,null,null},
                        2
                ),
                Arguments.of(
                        new Object[]{989,null,10250,98693,-89388,null,null,null,-32127},
                        2
                ),
                Arguments.of(
                        new Object[]{1},
                        1
                ),
                Arguments.of(
                        new Object[]{1,2,3,4,5,6,7},
                        3
                ),
                Arguments.of(
                        new Object[]{-1,-2,-3,-4,-5,-6,-7},
                        1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void maxLevelSum(Object[] input, int expected) {
        MaximumLevelSumOfABinaryTree solution = new MaximumLevelSumOfABinaryTree();
        TreeNode root = buildTree(input, 0);
        assertEquals(expected, solution.maxLevelSum(root));
    }

    private TreeNode buildTree(Object[] arr, int index) {
        if (index >= arr.length || arr[index] == null) return null;
        TreeNode node = new TreeNode((Integer) arr[index]);
        node.left = buildTree(arr, 2 * index + 1);
        node.right = buildTree(arr, 2 * index + 2);
        return node;
    }
}