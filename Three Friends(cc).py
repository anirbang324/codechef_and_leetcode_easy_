# cook your dish here
n=int(input())
for i in range(0,n):
    a,b,c=map(int,input().split())
    if a+b==c or b+c==a or c+a==b:
        print("yes")
    else:
        print("no")