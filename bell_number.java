// question : https://www.geeksforgeeks.org/bell-numbers-number-of-ways-to-partition-a-set/

import java.util.Scanner;

public class bell_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){

                if(j>i){
                    dp[i][j] = 0;
                }
                else if(i==j){
                    dp[i][j] = 1;
                }
                else if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = j*dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n+1;i++){
            ans+= dp[n][i];
        }
        System.out.println(ans);
    }
}
