n = int(input())  # Read an integer 'n' from the user

# Iterate 'n' times
for i in range(0, n):
    length = int(input())  # Read an integer 'length' from the user
    string = input()  # Read a string 'str' from the user

    # Check if the last character of the string is present in the rest of the string
    if string[-1] in string[:length-1]:
        print("YES")
    else:
        print("NO")
