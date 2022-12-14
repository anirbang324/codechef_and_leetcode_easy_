# question's link : https://leetcode.com/problems/contains-duplicate-ii/description/
from typing import List
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        dic = {}
        for i, v in enumerate(nums):
            if v in dic and i - dic[v]<=k:
                return True
            dic[v] = i
        return False

s = Solution()
nums = list(map(int,input().split(",")))
k = int(input())
print(s.containsNearbyDuplicate(nums,k))
