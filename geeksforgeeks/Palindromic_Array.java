// question - https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category[]=Arrays&sortBy=difficulty

package geeksforgeeks;
import java.util.*;
public class Palindromic_Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<n;i++){
                      int num = a[i];
                      int rev = 0;
                      int tmp = num;
                      
                      while(tmp>0){
                          int dig = tmp%10;
                          rev = rev *10+dig;
                          tmp/=10;
                      }
                      
                      if(num!=rev){
                          return 0;
                      }
                  }
                return 1;  
           }
}