package ds1;

import java.util.Arrays;

public class TwoWayMergeSort {
    public static void main(String[] args) {
        int[] itemsA = {1, 3, 5, 7, 9, 11, 13};
        int[] itemsB = {0, 2, 4, 6, 8};

        System.out.println(Arrays.toString(merge(itemsA, itemsB)));

    }

    public static int[] merge(int[] itemsA, int[] itemsB) {
        int lengthOfA = itemsA.length;
        int lengthOfB = itemsB.length;
        int[] results = new int[itemsA.length + itemsB.length];
        int a, b, r;
        a = b = r = 0;

        while (a < lengthOfA && b < lengthOfB) {
            if (itemsA[a] < itemsB[b])
                results[r++] = itemsA[a++];
            else
                results[r++] = itemsB[b++];
        }

        while (a < lengthOfA)
            results[r++] = itemsA[a++];
        while (b < lengthOfB)
            results[r++] = itemsB[b++];

        return results;
    }
}
