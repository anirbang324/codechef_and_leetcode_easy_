# cook your dish here
n=int(input())
for i in range(0,n):
    c,d,l=map(int,input().split())
    t=(c+d)*4
    m=max(0,c-2*d)
    if(t>=l and l%4==0 and (d+m)*4<=l ):
        print("yes")
    else:
        print("no")
        