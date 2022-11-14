/* No.5215
   Author : DDing
   Type : DP
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static class Info {
        int score;
        int cal;

        public Info(int score, int cal) {
            this.score = score;
            this.cal = cal;
        }
    }

    static Info[] infos;

    static int T, N, L;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            infos = new Info[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                infos[i] = new Info(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            dp = new int[N + 1][L + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= L; j++) {
                    if (infos[i - 1].cal > j) dp[i][j] = dp[i - 1][j];
                    else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - infos[i - 1].cal] + infos[i - 1].score);
                }
            }
            sb.append("#" + tc + " " + dp[N][L] + '\n');
        }
        System.out.print(sb);
    }
}
