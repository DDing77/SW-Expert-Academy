/* No.8673
   Author : DDing
   Type :
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    private static int T, K;
    private static int[] score;
    private static int res;

    public static int divideAndConquer(int left, int right) {
        if (right - left == 1) {
            res += Math.abs(score[left] - score[right]);
            return Math.max(score[left], score[right]);
        }
        int mid = (left + right) >> 1;
        int lSide = divideAndConquer(left, mid);
        int rSIde = divideAndConquer(mid + 1, right);
//        System.out.println("lSIde = " + lSide + ", rSide = " + rSIde);
        int max = Math.max(lSide, rSIde);
        res += Math.abs(lSide - rSIde);
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            K = Integer.parseInt(br.readLine());
            score = new int[(int) Math.pow(2, K)];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < score.length; i++) score[i] = Integer.parseInt(st.nextToken());
            res = 0;
            divideAndConquer(0, score.length - 1);
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
