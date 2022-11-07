/* No.1819
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                int cur = Integer.parseInt(st.nextToken());
                int sum = 0;
                while (cur > 0) {
                    sum += cur % 10;
                    cur /= 10;
                }
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
            sb.append("#" + tc + " " + max + " " + min + '\n');
        }
        System.out.print(sb);
    }
}

