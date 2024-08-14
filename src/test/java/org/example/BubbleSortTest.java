package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();

        // Test Case 1: Normal Case
        int[] array = {4, 1, 3, 9, 7};
        bubbleSort.bubbleSort(array);
        assertArrayEquals(new int[]{1, 3, 4, 7, 9}, array);

        // Test Case 2: Already Sorted
        int[] sortedArray = {1, 2, 3, 4, 5};
        bubbleSort.bubbleSort(sortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);

        // Test Case 3: Reverse Order
        int[] reverseArray = {5, 4, 3, 2, 1};
        bubbleSort.bubbleSort(reverseArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseArray);

        // Test Case 4: All Elements the Same
        int[] sameElementsArray = {7, 7, 7, 7, 7};
        bubbleSort.bubbleSort(sameElementsArray);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, sameElementsArray);

        // Test Case 5: Single Element
        int[] singleElementArray = {1};
        bubbleSort.bubbleSort(singleElementArray);
        assertArrayEquals(new int[]{1}, singleElementArray);

        // Test Case 6: Empty Array
        int[] emptyArray = {};
        bubbleSort.bubbleSort(emptyArray);
        assertArrayEquals(new int[]{}, emptyArray);
    }
}

