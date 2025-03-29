package org.example.LeetCode75.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        assertTrue(IsSubsequence.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void isSubsequence2() {
        assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void isSubsequence3() {
        assertTrue(IsSubsequence.isSubsequence("", "ahbgdc"));
    }

    @Test
    void isSubsequence4() {
        assertFalse(IsSubsequence.isSubsequence("aaaaaa", "bbaaaa"));
    }
}