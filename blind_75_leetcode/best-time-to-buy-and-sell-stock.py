# approach

from typing import List
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = prices[0]
        max_profit = 0

        for p in prices[1:]:
            max_profit = max(max_profit, p-min_price)
            min_price = min(min_price, p)

        return max_profit    

list = [7, 1, 5, 3, 6, 4]
obj = Solution()

print(obj.maxProfit(list))
'''
Sample input: 

prices = [7, 1, 5, 3, 6, 4]

Execution:

Initial State:

min_price = 7 (first price)
max_profit = 0
Iteration 1: p = 1

max_profit = max(0, 1 - 7) = 0 (no profit since the price dropped)
min_price = min(7, 1) = 1 (update min_price to 1)
Iteration 2: p = 5

max_profit = max(0, 5 - 1) = 4 (profit if bought at 1 and sold at 5)
min_price = min(1, 5) = 1 (no change to min_price)
Iteration 3: p = 3

max_profit = max(4, 3 - 1) = 4 (no better profit)
min_price = min(1, 3) = 1 (no change to min_price)
Iteration 4: p = 6

max_profit = max(4, 6 - 1) = 5 (profit if bought at 1 and sold at 6)
min_price = min(1, 6) = 1 (no change to min_price)
Iteration 5: p = 4

max_profit = max(5, 4 - 1) = 5 (no better profit)
min_price = min(1, 4) = 1 (no change to min_price)

Output : 5
'''