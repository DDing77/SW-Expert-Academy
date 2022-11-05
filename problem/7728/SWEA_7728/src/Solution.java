/* No.7728
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static int N;
    static boolean[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            number = new boolean[10];

            N = Integer.parseInt(br.readLine());
            while (N > 0) {
                if (!number[N % 10]) number[N % 10] = true;
                N /= 10;
            }

            int res = 0;
            for (int i = 0; i < 10; i++) {
                if (number[i] == true) res++;
            }

            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
