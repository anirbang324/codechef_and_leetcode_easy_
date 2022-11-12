# cook your dish here
n=int(input())

for i in range(0,n):
    arr=list(map(int,input().split()))
    x=len(arr)-1
    arr.remove(x)
    print(max(arr))