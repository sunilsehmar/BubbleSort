package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleTesting {
    @Test
    @DisplayName("With the given array, return it sorted with Bubble")
    void givenArrayReturnTheSortedArray() {
        int[] original = {1, 4, 7, 2, 8};
        int[] expected = {1, 2, 4, 7, 8};
        int[] answer = bubbleSort.bubbleSorting(original);

        Assertions.assertArrayEquals(expected, answer);
    }
}
