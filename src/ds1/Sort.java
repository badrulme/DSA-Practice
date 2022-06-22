package ds1;

import java.util.Arrays;

public class Sort {

    public enum SortOrder {
        ASC,
        DESC
    }

    private final int[] array = {-2, 45, 0, 11, -9};


    public void bubbleSortAsc(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * In short:
     * -> The Worst Case Time Complexity is: O(N2)
     * -> Average Case Time Complexity is: O(N2)
     * -> Best Case Time Complexity is: O(N2)
     * -> Space Complexity: O(1)
     * <p>
     * The number of swaps in Selection Sort are as follows:
     * -> Worst case: O(N)
     * -> Average Case: O(N)
     * -> Best Case: O(1)
     *
     * @param array
     */
    public void selectionSortAsc(int[] array) {

        int minIndex;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public void insertionSort(int[] array, SortOrder sortOrder) {
        if (SortOrder.ASC.equals(sortOrder)) {
            insertionSortAsc(array);
        } else {
            insertionSortDesc(array);
        }
    }

    public void insertionSort(int[] array) {
        insertionSortAsc(array);
    }

    public void insertionSortDesc(int[] array) {


    }

    /**
     * -> The worst case time complexity of Insertion sort is O(N^2)
     * -> The average case time complexity of Insertion sort is O(N^2)
     * -> The time complexity of the best case is O(N).
     * -> The space complexity is O(1)
     *
     * @param array
     */
    public void insertionSortAsc(int[] array) {

        int size = array.length;
        int j;
        int item;

        for (int i = 1; i < size; i++) {

            item = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > item) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = item;
        }

    }

    public void display() {
        System.out.println("=== === === ===");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        Sort sort = new Sort();

        sort.display();
//        sort.selectionSortAsc(sort.array);
//        sort.bubbleSortAsc(sort.array);
        sort.insertionSort(sort.array);
        sort.display();

    }
}
