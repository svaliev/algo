package com.learning.dp;

/**
 * Created by shamil.valiev on 2/20/2018.
 */
public class LCS {

    public static void main(String[] args) {
        int length = lcs(new char[]{'A', 'G', 'G', 'T', 'A', 'B'}, 6, new char[]{'G', 'X', 'T', 'X', 'A', 'Y', 'B'}, 7);
        System.out.println(length);
    }

    private static int lcs(char[] N, int n, char[] M, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (N[n-1] == M[m-1]) {
            return 1 + lcs(N, n-1, M, m-1);
        } else {
            return Math.max(lcs(N, n-1, M, m), lcs(N, n, M, m-1));
        }
    }
}
