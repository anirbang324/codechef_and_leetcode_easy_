// question: https://www.interviewbit.com/problems/palindrome-integer/
import java.util.Scanner;
public class palindrome_integer_interviewbit {
    public int isPalindrome(int A) {
        int r, sum = 0, temp;
        temp = A;
        while (A > 0){
            r = A%10;
            sum = (sum*10)+r;
            A = A/10;
        }
        if (temp == sum){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    public static void main(String[] args) {
        palindrome_integer_interviewbit obj = new palindrome_integer_interviewbit();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(obj.isPalindrome(a));

    }
}
