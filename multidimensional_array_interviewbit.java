// question: https://www.interviewbit.com/problems/multidimensional-arrays/

import java.lang.*;
import java.util.*;
public class multidimensional_array_interviewbit {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        
        for(int i=0;i<a;i++)
        {
            for(int j = 0; j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // store the sum of columns in sum array
        int[] sum = new int[b];
        // Initially fill all the elements in the array 0
        Arrays.fill(sum,0);
        for(int j = 0;j<b;j++){
            for(int i=0;i<a;i++){
                sum[j] += arr[i][j];
            }
        }
        // result
        for(int i: sum){
            System.out.print(i+" ");
        }
        
    }
}
