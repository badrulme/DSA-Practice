package ds1;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] items = {1, 4, 5, 2, 3, 6};
        System.out.println(Arrays.toString(items));
        mergeSort(items, 0, items.length - 1);
        System.out.println(Arrays.toString(items));
    }

    public static void mergeSort(int[] items, int left, int right) {
        int mid;
        if (left < right) {
            mid = left + (right - left) / 2;
            mergeSort(items, left, mid);
            mergeSort(items, mid + 1, right);
            merge(items, left, mid, right);
        }
    }

    public static void merge(int[] items, int left, int mid, int right) {

        int lengthOfList1 = mid - left + 1;
        int lengthOfList2 = right - mid;

        int[] list1 = new int[lengthOfList1];
        int[] list2 = new int[lengthOfList2];

        for (int i = 0; i < lengthOfList1; i++)
            list1[i] = items[left + i];
        for (int i = 0; i < lengthOfList2; i++)
            list2[i] = items[mid + 1 + i];


        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = j = 0;
        k = left;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[l..r]
        while (i < lengthOfList1 && j < lengthOfList2) {
            if (list1[i] < list2[j])
                items[k++] = list1[i++];
            else
                items[k++] = list2[j++];

        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A
        while (i < lengthOfList1)
            items[k++] = list1[i++];
        while (j < lengthOfList2)
            items[k++] = list2[j++];

    }
}
