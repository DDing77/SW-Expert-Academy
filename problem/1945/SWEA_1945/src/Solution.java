/* No.1945
   Author : DDing
   Type : Math
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int num;
    static int a, b, c, d, e;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            num = Integer.parseInt(br.readLine());
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;

            while (num % 2 == 0) {
                a++;
                num /= 2;
            }
            while (num % 3 == 0) {
                b++;
                num /= 3;
            }
            while (num % 5 == 0) {
                c++;
                num /= 5;
            }
            while (num % 7 == 0) {
                d++;
                num /= 7;
            }
            while (num % 11 == 0) {
                e++;
                num /= 11;
            }

            sb.append("#" + tc + " " + a + " " + b + " " + c + " " + d + " " + e + '\n');
        }
        System.out.print(sb);
    }
}
