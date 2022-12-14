# link : https://www.codechef.com/START69D/problems/SCALENE

t = int(input())
for i in range(t):
    a,b,c = map(int,input().split())
    if a==b or b==c or c==a:
        print("no")
    else:
        print("yes")