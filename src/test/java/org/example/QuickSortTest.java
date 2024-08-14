package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    void testQuickSort() {
        QuickSort quickSort = new QuickSort();

        // Test Case 1: Normal Case
        int[] array = {4, 1, 3, 9, 7};
        quickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 3, 4, 7, 9}, array);

        // Test Case 2: Already Sorted
        int[] sortedArray = {1, 2, 3, 4, 5};
        quickSort.quickSort(sortedArray, 0, sortedArray.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);

        // Test Case 3: Reverse Order
        int[] reverseArray = {5, 4, 3, 2, 1};
        quickSort.quickSort(reverseArray, 0, reverseArray.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseArray);

        // Test Case 4: All Elements the Same
        int[] sameElementsArray = {7, 7, 7, 7, 7};
        quickSort.quickSort(sameElementsArray, 0, sameElementsArray.length - 1);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, sameElementsArray);

        // Test Case 5: Single Element
        int[] singleElementArray = {1};
        quickSort.quickSort(singleElementArray, 0, singleElementArray.length - 1);
        assertArrayEquals(new int[]{1}, singleElementArray);

        // Test Case 6: Empty Array
        int[] emptyArray = {};
        quickSort.quickSort(emptyArray, 0, emptyArray.length - 1);
        assertArrayEquals(new int[]{}, emptyArray);
    }
}

