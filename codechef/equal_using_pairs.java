// qs - https://www.codechef.com/problems/PAIREQ

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class equal_using_pairs {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }
            int res = fun(N, A);
            System.out.println(res);
        }
    }

    public static int fun(int N, int A[]) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : A) {
            if (mp.containsKey(n)) {
                mp.put(n, mp.get(n) + 1);
            } else {
                mp.put(n, 1);
            }
        }
        int max_f = Collections.max(mp.values());
        int min_op = N - max_f;
        return min_op;
    }
}
