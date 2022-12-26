import java.util.*;
public class fibo_dp{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int res = myfun(n, new int[n+1]);
            System.out.println(res);
        }
    }
    public static int myfun(int n, int[] dp) // dp array to store the values
    {
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];  // if we find the element in the dp array we dont need to calculate again
        }
        int f1 = myfun(n-1, dp);
        int f2 = myfun(n-2, dp);
        int res = f1+f2;
        dp[n] = res;
        return res;
    }
}