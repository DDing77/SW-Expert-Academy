/* No.1986
   Author : DDing
   Type : Math
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
            int num = Integer.parseInt(br.readLine());

            int sum = 0;
            while (num > 0) {
                if (num % 2 == 0) sum -= num;
                else sum += num;
                num--;
            }

            sb.append("#" + tc + " ").append(sum).append('\n');
        }
        System.out.print(sb);
    }
}
