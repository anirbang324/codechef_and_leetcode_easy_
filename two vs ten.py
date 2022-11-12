# cook your dish here
n=int(input())

for i in range(0,n):
    a=int(input())
    if(a%10==0):
        print(0)
    elif(a%10==5):
        print(1)
    else:
        print(-1)