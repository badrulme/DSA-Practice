package ds1.searching;

public class BinarySearch1 {
    public static void main(String[] args) {

        int[] items = {1, 3, 4, 4, 4, 4, 4, 5, 6, 7, 10};
        int low = 0;
        int high = items.length - 1;
        int k = 4;
        int findingIndex = -1;

        System.out.println("high " + high);
        int step = 0;
        while (low <= high) {
            System.out.println("Step: " + step++);
            int mid = (low + high) / 2;
            if (items[mid] == k) {
                findingIndex = mid;
                break;
            } else if (items[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Finding index: " + findingIndex);
    }
}
