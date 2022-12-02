'''
problem link : https://www.codechef.com/problems/MISSP
'''

t = int(input())
for i in range(t):
    n = int(input())
    arr = []
    for i in range(n):
        val = int(input())
        arr.append(val)

    for i in set(arr):
        if arr.count(i) % 2 != 0:
            print(i)