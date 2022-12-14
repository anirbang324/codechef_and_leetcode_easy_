# link : https://www.codechef.com/START69D/problems/RAINFALL1
t = int(input())
for i in range(t):
    v = int(input())
    if v<3:
        print("light")
    elif v>=3 and v<7:
        print("moderate")
    else:
        print("heavy")