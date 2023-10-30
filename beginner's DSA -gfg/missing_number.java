// question - https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions
// User function Template for Java

class missing_number {
    int missingNumber(int array[], int n) {
        int total;
        total = (n+1) * (n)/2;
        for(int i=0;i<n-1;i++){
            total -= array[i];
        }
            return total;
        }
}