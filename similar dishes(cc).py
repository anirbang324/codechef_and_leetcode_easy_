# cook your dish here
n=int(input())
for i in range(0,n):
    ar1 = list(map(str,input().split(" ")))
    ar2 = list(map(str,input().split(" ")))
    count = 0
    for i in ar1:
        if i in ar2:
            count+=1
    if(count>=2):
        print("similar")
    else:
        print("dissimilar")