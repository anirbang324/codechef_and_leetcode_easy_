// qs - https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions

public class Wave_Array_gfg {

    // Method to convert the array to a wave array
    public static void convertToWave(int n, int[] a) {
        for (int i = 1; i <= n - 1; i += 2) {
            if (a[i] >= a[i - 1]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }

        // Additional code can be added here if needed
    }

    // Main method to test the convertToWave method
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        convertToWave(n, arr);

        System.out.println("Wave Array:");
        printArray(arr);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
