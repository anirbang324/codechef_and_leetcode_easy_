# cook your dish here
##Input Format
#First line will contain T, number of test cases. Then the test cases follow.
#Each test case contains of two lines of input.
#First line contains the string S - the hidden word.
#Second line contains the string T - the guess word.
#Output Format
#For each test case, print the value of string M.

#You may print each character of the string in uppercase or lowercase (for example, the strings BgBgB, BGBGB, bgbGB and bgbgb will all be treated as identical).

#Test Case 1: Given string S=ABCDE and T=EDCBA. The string M is:

#Comparing the first indices, A≠E, thus, M[1]=B.
#Comparing the second indices, B≠D, thus, M[2]=B.
#Comparing the third indices, C=C, thus, M[3]=G.
#Comparing the fourth indices, D≠B, thus, M[4]=B.
#Comparing the fifth indices, E≠A, thus, M[5]=B.
#Thus, M=BBGBB.
n=int(input())
for i in range(0,n):
    m= " "
    s=input()
    t=input()
    for i in range(0,5):
        if(s[i]==t[i]):
            m+='G'
        else:
            m+='B'
    print(m)