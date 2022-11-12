# cook your dish here
n=int(input())
for i in range(0,n):
    a,b,c,t,A,B,C=map(int,input().split())
    if A>=a and B>=b and C>=c and (A+B+C)>=t:
        print("YES")
    else:
        print("NO")