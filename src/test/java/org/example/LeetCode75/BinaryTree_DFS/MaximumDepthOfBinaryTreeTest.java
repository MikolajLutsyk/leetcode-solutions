package org.example.LeetCode75.BinaryTree_DFS;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new Object[]{3,9,20,null,null,15,7},
                        3
                ),
                Arguments.of(
                        new Object[]{1,null,2},
                        2
                ),
                Arguments.of(
                        new Object[]{},
                        0
                ),
                Arguments.of(
                        new Object[]{1},
                        1
                ),
                Arguments.of(
                        new Object[]{1,2,3,4,5,6,7,8},
                        4
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void maxDepth(Object[] input, int expected) {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = buildTree(input, 0);
        assertEquals(expected, solution.maxDepth(root));
    }

    private TreeNode buildTree(Object[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }
        TreeNode node = new TreeNode((Integer) arr[index]);
        node.left = buildTree(arr, 2 * index + 1);
        node.right = buildTree(arr, 2 * index + 2);
        return node;
    }
}