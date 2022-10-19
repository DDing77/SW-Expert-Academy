/* No.1970
   Author : DDing
   Type : Greedy
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + '\n');

            int number = Integer.parseInt(br.readLine());

            int idx = 0;
            while (idx < 8) {
                if ((number / money[idx]) > 0) {
                    sb.append(number / money[idx] + " ");
                    number %= money[idx];
                } else sb.append(0 + " ");
                idx++;
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
