t=int(input())
while(t>0):
    n=input()
    if(n.count('1')==1 or n.count('0')==1):
        print("Yes")
    else:
        print("No")
    t=t-1