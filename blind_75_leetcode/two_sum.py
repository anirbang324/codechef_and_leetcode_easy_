# my approach 
from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        val = 0
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)): 
                if nums[i] + nums[j] == target:
                    return i,j

lst = list(map(int,input().split()))
targ = int(input())           
obj = Solution()
result = obj.twoSum(lst,targ)
print(result)
                
# best approach - one-pass hash table

'''
It turns out we can do it in one-pass. While we are iterating and inserting elements into the hash table, 
we also look back to check if current element's complement already exists in the hash table. 
If it exists, we have found a solution and return the indices immediately.
'''
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        for i in range(len(nums)):
            complement = target - nums[i]

            if complement in hashmap:
                return [i,hashmap[complement]]
            hashmap[nums[i]] = i
            
            
# sample output - 



''' 

nums = [2, 7, 11, 15]
target = 9

Execution:

Iteration 1: i = 0

nums[0] = 2
complement = 9 - 2 = 7
hashmap = {} (initially empty)
7 is not in hashmap, so we add 2 to hashmap: hashmap = {2: 0}
Iteration 2: i = 1

nums[1] = 7
complement = 9 - 7 = 2
hashmap = {2: 0}
2 is in hashmap, which means the pair of numbers 2 (at index 0) and 7 (at index 1) sum up to the target of 9.
The function returns [1, 0]. '''