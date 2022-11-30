# cook your dish here

for i in range(int(input())):
    n = int(input())
    nl = list(map(int, input().split()))
    s = set(nl)
    m, count = min(nl), 0

    for i in nl:
        if i % m != 0:
            count = 1
            break
    if count == 1:
        print(len(nl))
    else:
        print(len(nl) - nl.count(m))
