// question : https://www.interviewbit.com/problems/arraylist/

import java.lang.*;
import java.util.*;
public class arraylist_interviewbit {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        ArrayList<Integer> arlst = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i>=0){
            arlst.add(i);
            i = sc.nextInt();
        }
        for(int j = arlst.size()-1;j>=0;j--){
            System.out.print(arlst.get(j)+" ");
        }
        
        
    }
}
