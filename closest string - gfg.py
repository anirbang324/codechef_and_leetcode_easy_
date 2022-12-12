# https://practice.geeksforgeeks.org/problems/closest-strings0611/1

# User function Template for python3

class Solution:
    def shortestDistance(self, s, word1, word2):
        # code here
        k = 0
        l = 0
        count = 0
        minm = 1000000

        for j in range(len(s)):
            if s[j] == word1:
                k = j
                count += 1
            if s[j] == word2:
                l = j
                count += 1
            if count >= 2:
                p = abs(l - k)
                minm = min(minm, p)

        return minm


# {
# Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        n = int(input())
        s = list(map(str, input().split()))
        word1 = input()
        word2 = input()
        ob = Solution()
        ans = ob.shortestDistance(s, word1, word2)
        print(ans)

# } Driver Code Ends