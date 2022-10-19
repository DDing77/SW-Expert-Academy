/* No.1974
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int[][] map;
    static boolean[] isChecked;

    static boolean div(int x, int y) {
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (isChecked[map[i][j]]) return false;
                else isChecked[map[i][j]] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            map = new int[10][10];
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) map[i][j] = Integer.parseInt(st.nextToken());
            }

            boolean isOk = true;

            for (int i = 0; i < 9; i++) {
                isChecked = new boolean[10];
                for (int j = 0; j < 9; j++) {
                    if (isChecked[map[i][j]]) {
                        isOk = false;
                        break;
                    } else isChecked[map[i][j]] = true;
                }
            }
//            System.out.println("test1 " + isOk);
            if (!isOk) {
                sb.append(0).append('\n');
                continue;
            }

            for (int j = 0; j < 9; j++) {
                isChecked = new boolean[10];
                for (int i = 0; i < 9; i++) {
                    if (isChecked[map[i][j]]) {
                        isOk = false;
                        break;
                    } else isChecked[map[i][j]] = true;
                }
            }
//            System.out.println("test2 " + isOk);

            if (!isOk) {
                sb.append(0).append('\n');
                continue;
            }

            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    isChecked = new boolean[10];
                    if (!div(i, j)) {
//                        System.out.println("i : " + i + ", j : " + j);
                        isOk = false;
                        break;
                    }
                }
            }
//            System.out.println("test3 " + isOk);

            if (!isOk) sb.append(0).append('\n');
            else sb.append(1).append('\n');
        }
        System.out.print(sb);
    }
}
