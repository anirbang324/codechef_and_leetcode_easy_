t=int(input())
for i in range(0,t):
    n,p,x,y=map(int,input().split())
    queue1=list(map(int,input().split(' ')))
    time=0
    for i in range(0,p):
        if(queue1[i]==0):
            time+=x
        else:
            time+=y
    print(time)
            
    
    