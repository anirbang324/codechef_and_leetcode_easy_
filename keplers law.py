# cook your dish here
n=int(input())

for  i in range(0,n):
    a,b,c,d=map(int,input().split())
    e=(a**2)/(c**3)
    f=(b**2)/(d**3)
    if(e==f):
        print("YES")
    else:
        print("NO")