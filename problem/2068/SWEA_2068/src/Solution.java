/* No.2068
   Author : DDing
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
            int res = Integer.MIN_VALUE;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                int cur = Integer.parseInt(st.nextToken());
                res = Math.max(cur, res);
            }
            sb.append("#" + tc + " " + res + '\n');
        }

        System.out.print(sb);
    }
}
