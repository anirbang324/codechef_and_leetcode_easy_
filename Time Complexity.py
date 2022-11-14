'''
Sample 1:
Input

4
9 9
15 7
10 19
21 20
Output
NO
YES
NO
YES
Explanation:
Test case 11: The number of comparisons used by algorithm AA is 99 and that used by BB is also 99. Since the number of comparisons used by AA is not more than that of BB, AA does not have more time complexity than BB.

Test case 22: The number of comparisons used by algorithm AA is 1515 and that used by BB is 77. Since the number of comparisons used by AA is more than that of BB, AA does have more time complexity than BB.

Test case 33: The number of comparisons used by algorithm AA is 1010 and that used by BB is 1919. Since the number of comparisons used by AA is not more than that of BB, AA does not have more time complexity than BB.

Test case 44: The number of comparisons used by algorithm AA is 2121 and that used by BB is 2020. Since the number of comparisons used by AA is more than that of BB, AA does have more time complexity than BB.
'''


for _ in range(int(input())):
    a,b = map(int,input().split())
    if(a>b):
        print("yes")
    else:
        print("no")