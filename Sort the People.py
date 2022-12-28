# problem link : https://leetcode.com/problems/sort-the-people/description/
# python solution using enumeration
names = ["Mary","John","Emma"]
heights = [180,165,170]
final = []
enum = enumerate(heights)
enum2 = sorted(enum, key = lambda x: x[1])
for n in list(enum2):
    final.append(names[n[0]])
print(reversed(list(final)))

