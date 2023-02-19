// question: https://www.interviewbit.com/problems/buffered-reader/

import java.lang.*;
import java.io.*;
import java.util.*;
public class buffered_reader_interviewbit {
    public static void main(String[] args) throws IOException {
        
        //your code goes here
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        System.out.println(a+" "+b);
        //System.out.println(b*110);
    }
}
