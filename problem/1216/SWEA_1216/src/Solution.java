/* No.1216
   Author : DDing
   Type : Bruteforce, String
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
            map = new char[100][100];
            for (int i = 0; i < 100; i++) map[i] = br.readLine().toCharArray();

            int maxLength = 1;
            // 가로
            for (int r = 0; r < 100; r++) {
                for (int i = 0; i < 100; i++) {
                    for (int j = i; j < 100; j++) {
                        int left = i;
                        int right = j;
                        int cnt = 0;
                        boolean isPalindrome = true;
                        while (left <= right) {
                            if (map[r][left] != map[r][right]) {
                                isPalindrome = false;
                                break;
                            }
                            left++;
                            right--;
                            if (left == right) cnt += 1;
                            else cnt += 2;
                        }
                        if (isPalindrome) maxLength = Math.max(maxLength, cnt);
                    }
                }
            }

            // 세로
            for (int c = 0; c < 100; c++) {
                for (int i = 0; i < 100; i++) {
                    for (int j = i; j < 100; j++) {
                        int left = i;
                        int right = j;
                        int cnt = 0;
                        boolean isPalindrome = true;
                        while (left <= right) {
                            if (map[left][c] != map[right][c]) {
                                isPalindrome = false;
                                break;
                            }
                            left++;
                            right--;
                            if (left == right) cnt += 1;
                            else cnt += 2;
                        }
                        if (isPalindrome) maxLength = Math.max(maxLength, cnt);
                    }
                }
            }
            sb.append("#" + tc + " " + maxLength + '\n');
        }
        System.out.print(sb);
    }
}
