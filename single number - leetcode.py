# problem link - https://leetcode.com/problems/single-number/description/

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        arrset = set(nums)
        setsum = sum(arrset)
        arrsum = sum(nums)

        res = 2*(setsum)-arrsum
        return res

s = Solution()
# myarr = [2,2,3,3,1]
myarr = list(map(int,input().split()))
print(s.singleNumber(myarr))