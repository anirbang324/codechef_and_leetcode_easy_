# User function template for Python 3

class Solution:
    def majorityElement(self, A, N):
        if N == 1:
            return A[0]
        A.sort()
        k = 1
        for i in range(len(A) - 1):
            if A[i] == A[i + 1]:
                k = k + 1
            else:
                k = 1
            if k > N // 2:
                return A[i]

        return -1


# {
# Driver Code Starts
# Initial Template for Python 3

import math

from sys import stdin


def main():
    T = int(input())
    while (T > 0):
        N = int(input())

        A = [int(x) for x in input().strip().split()]

        obj = Solution()
        print(obj.majorityElement(A, N))

        T -= 1


if __name__ == "__main__":
    main()
# } Driver Code Ends