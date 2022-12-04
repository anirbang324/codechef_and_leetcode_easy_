# problem link : https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&category[]=Arrays&curated[]=1&sortBy=difficulty


# User function Template for python3

class Solution:
    # Function to check if two arrays are equal or not.
    def check(self, A, B, N):

        # return: True or False
        newa = sorted(A)
        newb = sorted(B)

        if newa == newb:
            return 1
        else:
            return 0
        # code here


# {
# Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for tc in range(t):

        N = int(input())

        A = [int(x) for x in input().replace('  ', ' ').strip().split(' ')]
        B = [int(x) for x in input().replace('  ', ' ').strip().split(' ')]
        ob = Solution()
        if ob.check(A, B, N):
            print(1)
        else:
            print(0)

# } Driver Code Ends