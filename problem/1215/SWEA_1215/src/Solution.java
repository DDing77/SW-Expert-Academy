/* No.1215
   Author : DDing
   Type : Bruteforce
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T, N;
    static char[][] map;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = 10;
        for (int tc = 1; tc <= T; tc++) {

            N = Integer.parseInt(br.readLine());
            map = new char[8][8];
            for (int i = 0; i < 8; i++) map[i] = br.readLine().toCharArray();

            res = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - N; j++) {
                    int left = j;
                    int right = j + N - 1;
                    boolean isPalindrome = true;
                    while (isPalindrome && left < right) {
                        if (map[i][left++] != map[i][right--]) isPalindrome = false;
                    }
                    if (isPalindrome) res++;
                }
            }

            for (int j = 0; j < 8; j++) {
                for (int i = 0; i <= 8 - N; i++) {
                    int top = i;
                    int down = i + N - 1;
                    boolean isPalindrome = true;
                    while (isPalindrome && top < down) {
                        if (map[top++][j] != map[down--][j]) isPalindrome = false;
                    }
                    if (isPalindrome) res++;
                }
            }

            sb.append("#" + tc + " " + res + '\n');

        }
        System.out.print(sb);
    }
}
