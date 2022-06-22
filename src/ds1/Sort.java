package ds1;

public class Sort {
    private int[] array = {-2, 45, 0, 11, -9};

    public static void main(String[] args) {

        Sort sort = new Sort();

        sort.display();
        sort.selectionSort(sort.array);
        sort.bubbleSort(sort.array);
        sort.display();

    }

    public void bubbleSort(int[] array) {
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
    public void selectionSort(int[] array) {

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

    public void display() {
        System.out.println("=== === === ===");
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
