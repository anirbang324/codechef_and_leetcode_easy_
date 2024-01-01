import java.util.Scanner;

public class FirstOccurrence_LeetCode {

    // Method to find the first occurrence of the needle in the haystack
    public int strStr(String haystack, String needle) {
        // Check if either haystack or needle is null
        if (haystack == null || needle == null) {
            return -1; // Return -1 if either haystack or needle is null
        }

        int index = haystack.indexOf(needle); // Use indexOf method to find the index of the first occurrence
        return index;
    }

    public static void main(String[] args) {
        FirstOccurrence_LeetCode solution = new FirstOccurrence_LeetCode(); // Create an instance of the class
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the haystack string: ");
        String haystack = scanner.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = scanner.nextLine();

        int result = solution.strStr(haystack, needle); // Call the strStr method to find the index

        // Display the result
        System.out.println("Index of '" + needle + "' in '" + haystack + "': " + result);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
