/* No.2805
   Author : DDing
   Type : Graph
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int T, N;
    static char[][] map;
    static boolean[][] isVisited;
    static int sum;

    static void bfs() {
        sum = map[N / 2][N / 2] - '0';
        int cnt = getCnt();
//        System.out.println("cnt = " + cnt);
        Queue<int[]> que = new LinkedList<>();
        if (cnt > 0) {
            que.add(new int[]{N / 2, N / 2});
            isVisited[N / 2][N / 2] = true;
            cnt--;
        }

        while (cnt > 0 && !que.isEmpty()) {
            int[] cur = que.poll();
            for (int k = 0; k < 4; k++) {
                int nX = cur[0] + dir[k][0];
                int nY = cur[1] + dir[k][1];

                if (nX < 0 || nX >= N || nY < 0 || nY >= N) continue;
                if (isVisited[nX][nY]) continue;

                sum += map[nX][nY] - '0';
                isVisited[nX][nY] = true;
                que.add(new int[]{nX, nY});
                cnt--;
            }
// 1 5 13 25
        }
    }

    static int getCnt() {
        int cnt = N / 2;
        int temp = 1;
        int sum = 1;
        while (temp <= cnt) {
            sum += temp++ * 4;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            map = new char[N][N];
            isVisited = new boolean[N][N];
            sum = 0;

            for (int i = 0; i < N; i++) map[i] = br.readLine().toCharArray();
            bfs();
            sb.append("#" + tc + " " + sum + '\n');
        }
        System.out.print(sb);
    }
}
