/* No.9229
   Author : DDing
   Type : Combination
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int TC;
    static int N, M;
    static int[] snack;
    static boolean[] isVisited;
    static int res;

    static void dfs(int idx, int depth, int sum) {
        if (depth == 2) {
            if (sum <= M) res = Math.max(res, sum);
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(i + 1, depth + 1, sum + snack[i]);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        TC = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= TC; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            snack = new int[N];
            isVisited = new boolean[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) snack[i] = Integer.parseInt(st.nextToken());

            res = -1;
            dfs(0, 0, 0);

            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
