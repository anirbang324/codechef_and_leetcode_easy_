# question : https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/

from ast import List
from collections import defaultdict


class Solution:
    def minimumFuelCost(self, roads: List[List[int]], seats: int) -> int:
        G = defaultdict(list)
        for s, e in roads:
            G[s].append(e)
            G[e].append(s)
        total = 0
        def go(node, parent):
            nonlocal total
            accum = 1
            for n in G[node]:
                if n == parent:
                    continue
                rep = go(n, node)
                total += (rep + seats - 1) // seats
                accum += rep
            return accum
        go(0, -1)
        return total