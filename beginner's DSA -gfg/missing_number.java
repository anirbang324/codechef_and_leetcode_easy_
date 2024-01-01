// question - https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions
// User function Template for Java

public class missing_number {

    // Method to find the missing number in the array
    int missingNumber(int array[], int n) {
        int total;
        total = (n + 1) * (n) / 2;
        for (int i = 0; i < n - 1; i++) {
            total -= array[i];
        }
        return total;
    }

    // Main method to test the missingNumber method
    public static void main(String[] args) {
        missing_number missingNumberObj = new missing_number();

        // Example usage:
        int[] array = { 1, 2, 4, 6, 3, 7, 8 };
        int n = array.length + 1;

        int result = missingNumberObj.missingNumber(array, n);

        System.out.println("Missing Number: " + result);
    }
}
