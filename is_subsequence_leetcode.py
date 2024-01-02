# https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0

        while i < len(s) and j < len(t):
            if s[i] == t[j]:
                i += 1
            j += 1

        return i == len(s)

# Main method to take inputs from the user and test isSubsequence method
if __name__ == "__main__":
    solution = Solution()

    # Example usage:
    s_input = input("Enter the subsequence (s): ")
    t_input = input("Enter the string (t): ")

    result = solution.isSubsequence(s_input, t_input)

    print(f"Is '{s_input}' a subsequence of '{t_input}'? {result}")
