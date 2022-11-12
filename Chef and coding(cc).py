# cook your dish here
n=int(input())
while n>0:
    m=int(input())
    c=input()
    r=c.count('R')
    g=c.count('G')
    b=c.count('B')
    max1=max(r,g,b)
    print(len(c)-max1)
    n-=1