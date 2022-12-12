# https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1?page=2&category[]=Strings&sortBy=submissions

# User function Template for python3
class Solution:
    def removeDups(self, S):

    # code here

        str2 = ""

        for i in S:
            if i not in str2:
                str2 = str2 + i
        return str2


# {
# Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        s = input()

        ob = Solution()
        answer = ob.removeDups(s)

        print(answer)

# } Driver Code Ends