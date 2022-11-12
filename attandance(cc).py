# cook your dish here
n=int(input())

for i in range(0,n):
    m=int(input())
    arr=[]
    for j in range(0,m):
        a,b=map(str,input().split())
        arr.append(a)
        arr.append(b)
    i=0
    while(i<=(m*2)-1):
        if arr.count(arr[i])>1:
            print(arr[i], arr[i+1])
        else:
            print(arr[i])
        i+=2