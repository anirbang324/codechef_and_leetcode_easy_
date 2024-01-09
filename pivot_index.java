// question link : https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan&id=level-1
// explanation : https://leetcode.com/problems/find-pivot-index/solutions/3060249/1ms-only-best-easy-to-understand-than-officail-solution-with-explanation/?envType=study-plan&id=level-1&languageTags=java

public class pivot_index {
    public int pivotIndex(int[] nums) {
        int left = 0, right = 0;

        // Calculate the sum of elements on the right side of the pivot (starting from
        // index 1)
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }

        // Check if the pivot is at the beginning (index 0)
        if (left == right) {
            return 0;
        }

        // Iterate through the array to find the pivot index
        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];
            right -= nums[i];

            // Check if the left and right sums are equal
            if (left == right) {
                return i;
            }
        }

        // If no pivot is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example usage: Test the pivotIndex method with an array
        pivot_index solution = new pivot_index();

        // Test array with a pivot at index 3
        int[] nums1 = { 1, 7, 3, 6, 5, 6 };
        System.out.println("Pivot index for nums1: " + solution.pivotIndex(nums1)); // Output: 3

        // Test array with no pivot
        int[] nums2 = { 1, 2, 3 };
        System.out.println("Pivot index for nums2: " + solution.pivotIndex(nums2)); // Output: -1
    }
}
