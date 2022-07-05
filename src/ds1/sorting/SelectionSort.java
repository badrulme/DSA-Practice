package ds1.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] items = {1, 4, 6, 2, 3, 10, 8};
        System.out.println(Arrays.toString(items));
        sortInAscOrder(items);
        System.out.println(Arrays.toString(items));
        sortInDescOrder(items);
        System.out.println(Arrays.toString(items));
    }

    public static void sortInAscOrder(int[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i] > items[j]) {
                    int temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
    }

    public static void sortInDescOrder(int[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i] < items[j]) {
                    int temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
    }
}
