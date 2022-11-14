/* No.2814
   Author : DDing
   Type : Graph
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int N, M;
    static boolean[] isVisited;
    static ArrayList<Integer>[] adj;
    static int res;

    static void dfs(int start, int cnt) {
        res = Math.max(res, cnt);

        isVisited[start] = true;

        for (int next : adj[start]) {
            if (isVisited[next]) continue;
//            isVisited[start] = true;
            dfs(next, cnt + 1);
            isVisited[start] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            adj = new ArrayList[N + 1];
            for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                adj[from].add(to);
                adj[to].add(from);
            }

            res = 0;
            for (int i = 1; i <= N; i++) {
                isVisited = new boolean[N + 1];
//                isVisited[i] = true;
                dfs(i, 1);
//                isVisited[i] = false;
            }

            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
