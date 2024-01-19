import java.io.*;
class ThreeWayPartitioning {
    // Partitions arr[0..n-1] around [lowVal..highVal]
    public static void threeWayPartition(int[] arr, int lowVal, int highVal) {
        int n = arr.length;

        // Initialize three pointers
        int start = 0, current = 0, end = n - 1;

        // Traverse elements
        while (current <= end) {
            // If the current element is smaller than the range, put it in the next available smaller position.
            if (arr[current] < lowVal) {
                swap(arr, start, current);
                start++;
                current++;
            }
            // If the current element is greater than the range, put it in the next available greater position.
            else if (arr[current] > highVal) {
                swap(arr, current, end);
                end--;
            } else
                current++;
        }
    }

    // Helper method to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};

        threeWayPartition(arr, 10, 20);

        System.out.println("Modified array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
