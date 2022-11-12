for _ in range(int(input())):
    s1,s2=list(map(int,input().split())),list(map(int,input().split()))
    print('Pass') if sum(s1)==sum(s2) else print("Fail")