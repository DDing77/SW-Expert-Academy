/* No.1217
   Author : DDing
   Type : Math
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;

    static int getPow(int a, int b, int val) {
        if (b == 0) return val;
        return getPow(a, b - 1, val * a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = 10;
        for (int tc = 1; tc <= T; tc++) {
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int res = getPow(a, b, 1);
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
