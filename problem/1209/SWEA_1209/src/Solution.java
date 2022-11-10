/* No.1209
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int map[][];
    static int max;

    static void getVerticalMax() {
        for (int c = 0; c < 100; c++) {
            int verticalSum = 0;
            for (int r = 0; r < 100; r++) {
                verticalSum += map[r][c];
            }
            max = Math.max(max, verticalSum);
        }
    }

    static void getLeftToRightSlashMax() {
        int tempSum = 0;
        for (int r = 0; r < 100; r++) {
            tempSum += map[r][r];
        }
        max = Math.max(max, tempSum);
    }

    static void getRightToLeftSlashMax() {
        int tempSum = 0;
        for (int r = 99; r >= 0; r--) {
            tempSum += map[r][99 - r];
        }
        max = Math.max(max, tempSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
            map = new int[100][100];
            max = 0;
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                int horizonSum = 0;
                for (int j = 0; j < 100; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    horizonSum += map[i][j];
                }
                max = Math.max(max, horizonSum);
            }

            getVerticalMax();
            getLeftToRightSlashMax();
            getRightToLeftSlashMax();

            sb.append("#" + tc + " " + max + '\n');
        }
        System.out.print(sb);
    }
}
