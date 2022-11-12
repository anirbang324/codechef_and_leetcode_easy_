# cook your dish here
n=int(input())

for i in range(0,n):
    a=input()
    if('10' in a or '11' in a):
        print("YES")
    else:
        print("NO")