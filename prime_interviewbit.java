// question : https://www.interviewbit.com/problems/verify-prime/

import java.util.Scanner;

public class prime_interviewbit {
    public int isPrime(int A) {
        if(A==1) return 0;
    for(int i=2;i*i<=A;i++){
        if(A%i==0){
            return 0;
        }
        else continue;
    }
    return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_interviewbit obj = new prime_interviewbit();
        System.out.println(obj.isPrime(n));
    }
}
