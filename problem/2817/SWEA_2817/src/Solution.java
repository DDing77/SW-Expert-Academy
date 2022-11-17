/* No.2817
   Author : DDing
   Type : DP
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int N, K;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N + 1];
            dp = new int[100001];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

            int sum = 0;
            dp[0] = 1;
            for (int i = 0; i < N; i++) {
                sum += arr[i];
                for (int j = sum; j >= 0; j--) {
                    if (dp[j] != 0) {
                        dp[j + arr[i]] += dp[j];
                    }
                }
            }

            sb.append("#" + tc + " " + dp[K] + '\n');
        }
        System.out.print(sb);
    }
}
