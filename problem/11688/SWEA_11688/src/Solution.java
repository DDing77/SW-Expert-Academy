/* No.11688
   Author : DDing
   Type : math
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            a = 1;
            b = 1;

            String op = br.readLine();
            for (int i = 0; i < op.length(); i++) {
                char cur = op.charAt(i);
                if (cur == 'L') b += a;
                else a += b;
            }

            sb.append("#" + tc + " " + a + " " + b + '\n');
        }
        System.out.print(sb);
    }
}
