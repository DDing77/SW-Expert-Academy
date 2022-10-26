/* No.1954
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int N;
    static int[][] map;
    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            map = new int[N + 1][N + 1];

            int r = 1;
            int c = 1;
            int cnt = 1;
            int dirCnt = 0;
            while (cnt <= N * N) {
                // right
                if (dirCnt == 0) {
                    while (c <= N && map[r][c] == 0) {
                        map[r][c] = cnt++;
                        c++;
                    }
                    c--;
                } else if (dirCnt == 1) {
                    while (r <= N && map[r][c] == 0) {
                        map[r][c] = cnt++;
                        r++;
                    }
                    r--;
                } else if (dirCnt == 2) {
                    while (c > 0 && map[r][c] == 0) {
                        map[r][c] = cnt++;
                        c--;
                    }
                    c++;
                } else if (dirCnt == 3) {
                    while (r > 0 && map[r][c] == 0) {
                        map[r][c] = cnt++;
                        r--;
                    }
                    r++;
                }
                dirCnt++;
                dirCnt %= 4;
                r += dir[dirCnt][0];
                c += dir[dirCnt][1];
            }

            sb.append("#" + tc + '\n');
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) sb.append(map[i][j] + " ");
                sb.append('\n');
            }
        }

        System.out.print(sb);
    }
}
