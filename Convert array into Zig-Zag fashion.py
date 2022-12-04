# link : https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&category[]=Arrays&curated[]=1&sortBy=difficulty

arr = [4, 3, 7, 8, 6, 2, 1]

for i in range(len(arr) - 1):

    if i%2==0 and arr[i] > arr[i + 1]:
        arr[i], arr[i + 1] = arr[i + 1], arr[i]

    if i%2==1 and arr[i] < arr[i + 1]:
        arr[i], arr[i + 1] = arr[i + 1], arr[i]

print(arr)
