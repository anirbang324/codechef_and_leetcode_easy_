'''

input :
4
4
abab
5
cbcba
4
abcd
6
pqprqr

output : 
YES
NO
NO
YES
'''
n = int(input())
for i in range(n):
    lg = int(input())
    mystring = input()
    mydict = {}

    for c in mystring:
        if c in mydict:
            mydict[c] += 1
        else:
            mydict[c] = 1

    flag = False

    for x in mydict:
        if mydict[x] % 2 == 1:
            print("no")
            flag = True
            break
        else:
            continue

    if (not flag):
        print("yes")