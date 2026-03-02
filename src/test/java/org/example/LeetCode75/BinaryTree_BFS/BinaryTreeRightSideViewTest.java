package org.example.LeetCode75.BinaryTree_BFS;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeRightSideViewTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new Object[]{1,2,3,null,5,null,4},
                        new Integer[]{1,3,4}
                ),
                Arguments.of(
                        new Object[]{1,null,3},
                        new Integer[]{1,3}
                ),
                Arguments.of(
                        new Object[]{},
                        new Integer[]{}
                ),
                Arguments.of(
                        new Object[]{1},
                        new Integer[]{1}
                ),
                Arguments.of(
                        new Object[]{1,2,3,4,5,6,7},
                        new Integer[]{1,3,7}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void rightSideView(Object[] input, Integer[] expected) {
        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();
        TreeNode root = buildTree(input, 0);
        List<Integer> result = solution.rightSideView(root);
        assertArrayEquals(expected, result.toArray(new Integer[0]));
    }

    private TreeNode buildTree(Object[] arr, int index) {
        if (index >= arr.length || arr[index] == null) return null;
        TreeNode node = new TreeNode((Integer) arr[index]);
        node.left = buildTree(arr, 2 * index + 1);
        node.right = buildTree(arr, 2 * index + 2);
        return node;
    }
}