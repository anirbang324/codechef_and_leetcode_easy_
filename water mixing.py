'''Chef is setting up a perfect bath for himself. He has XX litres of hot water and YY litres of cold water.
The initial temperature of water in his bathtub is AA degrees. On mixing water, the temperature of the bathtub changes as following:

The temperature rises by 11 degree on mixing 11 litre of hot water.
The temperature drops by 11 degree on mixing 11 litre of cold water.
Determine whether he can set the temperature to BB degrees for a perfect bath.'''
n = int(input())
for i in range(n):
    a, b, h, c = map(int, input().split())
    chck = a - b
    if (chck == 0):
        print("yes")
    elif (chck < 0):
        if (abs(chck) <= h):
            print("yes")
        else:
            print("no")

    else:
        if (abs(chck) <= c):
            print("yes")
        else:
            print("no")

