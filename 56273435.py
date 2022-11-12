# cook your dish here
n=int(input())
for i in range(0,n):
    len = int(input())
    str= input()
    if(str[-1] in str[:len-1]):
        print("YES")
    else:
        print("NO")