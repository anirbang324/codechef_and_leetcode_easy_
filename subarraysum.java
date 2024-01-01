//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&difficulty=Medium&sortBy=submissions

//This code finds a subarray with the given sum and returns the starting and ending indices of the subarray. If no subarray is found, it returns -1.

import java.util.ArrayList;

public class subarraysum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int end = 0;
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;

        while (end < n) {
            sum += arr[end];
 
                sum -= arr[i];
                i++;
            }

            if (sum == s && i <= end) {
                al.add(i + 1); // Add starting index of subarray
                al.add(end + 1); // Add ending index of subarray
                return al;
            }

            end++;
        }

        al.add(-1); // If no subarray is found
        return al;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int targetSum = 15;

        ArrayList<Integer> result = subarraySum(arr, n, targetSum);

        if (result.get(0) == -1) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        }
    }
}
