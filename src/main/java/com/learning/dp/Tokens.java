package com.learning.dp;

public class Tokens {

    public static void main(String[] args) {
        int cnt = calcTokenCnt(new int[]{1, 3, 5}, 13);
        System.out.println(cnt);
    }

    private static int calcTokenCnt(int[] V, int S) {
        int[] M = new int[S+1];
        for (int z = 1; z < M.length; z++) {
            M[z] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < M.length; i++) {
            for (int j = 0; j < V.length; j++) {
                if (V[j] <= i && M[i-V[j]] + 1 <= M[i]) {
                    M[i] = M[i-V[j]] + 1;
                }
            }
        }
        return M[S];
    }

}
