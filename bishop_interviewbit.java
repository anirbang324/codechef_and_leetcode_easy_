// question: https://www.interviewbit.com/problems/total-moves-for-bishop/

import java.util.Scanner;
public class bishop_interviewbit {
    public int solve(int A, int B) {
        if(A==1||B==1||A==8||B==8)
  return 7;
  else if(A==2||B==2||A==7||B==7)
  return 9;
  else if(A==3||B==3||A==6||B==6)
  return 11;
  else
  return 13;
  }
  public static void main(String[] args) {
    bishop_interviewbit ob = new bishop_interviewbit();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(ob.solve(a, b));
  }
}
