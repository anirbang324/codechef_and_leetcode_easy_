# cook your dish here
t=int(input())
for i in range (t):
    k=int(input())
    
    n = input()[:k]

    if ("I" in n):
        print("INDIAN")

    elif('Y' in n):
        print("NOT INDIAN")

    else:
        print("NOT SURE")  