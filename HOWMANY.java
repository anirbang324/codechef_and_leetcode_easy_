/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 	// your code goes here
	 	   Scanner sc=new Scanner(System.in);
	 	   String a; int b;
	 	   a=sc.next();
	 	   b=a.length();
	 	   if(b==1){
	 	       System.out.println(1);
	 	   }
	 	   else if(b==2){
	 	       System.out.println(2);
	}
	    else if(b==3){
	        System.out.println(3);
	    }
	    else{
	        System.out.println("More than 3 digits");
	    }
}
}
