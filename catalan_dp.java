// link : https://www.geeksforgeeks.org/program-nth-catalan-number/

import java.io.*;
class catalan_dp{
    // catalan number 
    static int cat_dp(int n){

        // table to store the results of the subproblems
        int dp[] = new int[n+2];

        // initialize the first two values in table
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = 0;
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(cat_dp(i));
        }
    }
}