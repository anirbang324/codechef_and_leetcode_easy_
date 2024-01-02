import java.util.Scanner;

public class is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i = i + 1;
            }
            j = j + 1;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        is_subsequence solution = new is_subsequence();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subsequence (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the string (t): ");
        String t = scanner.nextLine();

        boolean result = solution.isSubsequence(s, t);

        System.out.println("Is '" + s + "' a subsequence of '" + t + "'? " + result);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
