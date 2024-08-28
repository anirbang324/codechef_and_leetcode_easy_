# https://leetcode.com/problems/product-of-array-except-self/description/

from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        total_prod = 1
        zero_count = 0

        for num in nums:
            if num != 0:
                total_prod *= num
            else:
                zero_count += 1
        res = []

        if zero_count > 1:
            return [0] * len(nums)
        
        for num in nums:
            if num != 0:
                if zero_count == 1:
                    res.append(0)
                else:
                    res.append(total_prod//num)
            else:
                res.append(total_prod)
        return res
        
            

nums = [1,2,3,4]
obj = Solution()
print(obj.productExceptSelf(nums))      