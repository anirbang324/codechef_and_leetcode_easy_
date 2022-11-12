# cook your dish here
n=int(input())

for i in range(0,n):
    a,b=map(int,input().split())
    if a>b:
        print(a,end=' ')
    else:
        print(b,end=' ')
    print(a+b)