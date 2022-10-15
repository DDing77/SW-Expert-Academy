/* No.2005
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T, N;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + '\n');
            sb.append(1 + " ").append('\n');

            N = Integer.parseInt(br.readLine());

            map = new int[N + 1][N + 1];

            map[1][1] = 1;

            for (int i = 2; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        map[i][j] = 1;
                        sb.append(1 + " ");
                    } else {
                        map[i][j] = map[i - 1][j - 1] + map[i - 1][j];
                        sb.append(map[i][j] + " ");
                    }
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
