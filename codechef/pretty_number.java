// /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pretty_number {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            for (int j = a; j <= b; j++) {
                int num = j % 10;
                if (num == 2 || num == 3 || num == 9) {
                    c = c + 1;
                }
            }
            System.out.println(c);
        }
    }
}
