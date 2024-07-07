# question - https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&company=Amazon&sortBy=submissions
from typing import List


class Solution:
    def duplicates(self, n : int, arr : List[int]) -> List[int]:
        res = []
        res2 = []
        
        for i in arr:
            if i not in res:
                res.append(i)
            else:
                if i not in res2:
                    res2.append(i)
                    
        
        if len(res2) == 0:
            return [-1]
        else:
            return sorted(res2)