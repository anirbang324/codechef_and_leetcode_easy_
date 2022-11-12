# cook your dish here
n=int(input())

for i in range(0,n):
    a,b,t = map(int,input().split())
    if(t%2!=0):
        a=a*2
    f=max(a,b)//min(a,b)
    print(f)