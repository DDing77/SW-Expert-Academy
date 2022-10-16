/* No.1204
   Author : DDing
   Type : Counting-Sorting
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int[] score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            br.readLine();

            score = new int[101];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                score[Integer.parseInt(st.nextToken())]++;
            }

            int max = Integer.MIN_VALUE;
            int res = -1;
            for (int i = 1; i <= 100; i++) {
                if (score[i] >= max) {
                    max = score[i];
                    res = i;
                }
            }

            sb.append("#" + tc + " " + res).append('\n');
        }
        System.out.print(sb);
    }
}
