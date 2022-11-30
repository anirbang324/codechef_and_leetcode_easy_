from typing import List


class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dct = {}
        for i in nums:
            dct[i] = dct.get(i, 0) + 1
        for i in nums:
            if dct[i] > (len(nums) // 2):
                return i


s = Solution()
answer = s.majorityElement([3, 2, 3])
print(answer)
