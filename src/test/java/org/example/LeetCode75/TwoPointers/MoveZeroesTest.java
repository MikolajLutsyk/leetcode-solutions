package org.example.LeetCode75.TwoPointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        int[] data = new int[]{0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(data);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, data);
    }
}