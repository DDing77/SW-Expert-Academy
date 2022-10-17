/* No.1979
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    static int T, N, K;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; ++tc) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) map[i][j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            int res = 0;

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (map[i][j] == 1) cnt++;
                    else if (cnt >= 1 && map[i][j] == 0) {
                        if (cnt == K) res++;
                        cnt = 0;
                    }
                }

                if (cnt == K) res++;
                cnt = 0;
            }

            for (int j = 0; j < N; ++j) {
                for (int i = 0; i < N; ++i) {
                    if (map[i][j] == 1) cnt++;
                    else if (cnt >= 1 && map[i][j] == 0) {
                        if (cnt == K) res++;
                        cnt = 0;
                    }
                }
                if (cnt == K) res++;
                cnt = 0;
            }
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
