package ds1;

import java.util.Arrays;

public class FourWayMergeSort {
    public static void main(String[] args) {
        int[] listA = {0, 2, 4, 6};
        int[] listB = {1, 3, 5, 7};
        int[] listC = {1, 5, 10, 15};
        int[] listD = {10, 20, 30, 40};

        int[] firstMergedResult = merge(listA, listB);
        System.out.println("firstMergedResult: " + Arrays.toString(firstMergedResult));
        int[] secondMergedResult = merge(listC, listD);
        System.out.println("secondMergedResult: " + Arrays.toString(secondMergedResult));
        int[] finalMergeResult = merge(firstMergedResult, secondMergedResult);
        System.out.println("finalMergeResult: " + Arrays.toString(finalMergeResult));


    }

    public static int[] merge(int[] list1, int[] list2) {
        int lengthOfList1 = list1.length;
        int lengthOfList2 = list2.length;

        int[] results = new int[lengthOfList1 + lengthOfList2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lengthOfList1 && j < lengthOfList2) {
            if (list1[i] < list2[j]) results[k++] = list1[i++];
            else results[k++] = list2[j++];
        }

        while (i < lengthOfList1) results[k++] = list1[i++];
        while (j < lengthOfList2) results[k++] = list2[j++];

        return results;
    }
}
