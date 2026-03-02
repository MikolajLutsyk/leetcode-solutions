package org.example.LeetCode75.LinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DeleteTheMiddleNodeOfALinkedListTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,3,4,7,1,2,6},
                        new int[]{1,3,4,1,2,6}
                ),
                Arguments.of(
                        new int[]{1,2,3,4},
                        new int[]{1,2,4}
                ),
                Arguments.of(
                        new int[]{2,1},
                        new int[]{2}
                ),
                Arguments.of(
                        new int[]{1},
                        new int[]{}
                ),
                Arguments.of(
                        new int[]{1,2,3,4,5},
                        new int[]{1,2,4,5}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void deleteMiddle(int[] input, int[] expected) {
        DeleteTheMiddleNodeOfALinkedList solution =
                new DeleteTheMiddleNodeOfALinkedList();

        ListNode head = buildList(input);
        ListNode result = solution.deleteMiddle(head);

        assertArrayEquals(expected, toArray(result));
    }

    private static ListNode buildList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private static int[] toArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}