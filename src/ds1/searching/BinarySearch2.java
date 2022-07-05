package ds1.searching;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] items = {1, 3, 5, 5, 5, 6, 7, 8, 9, 22, 22, 25, 27};
        int k = 5;

        System.out.println("Lower bound of " + k + " is: " + lowerBound(items, k));
        System.out.println("Upper bound of " + k + " is: " + upperBound(items, k));
    }

    public static int lowerBound(int[] items, int k) {
        int low = 0;
        int high = items.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (k <= items[mid]) high = mid;
            else low = mid + 1;
        }
        return high;
    }

    public static int upperBound(int[] items, int k) {
        int low = 0;
        int high = items.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (k < items[mid]) high = mid;
            else low = mid + 1;
        }
        return high;
    }
}
