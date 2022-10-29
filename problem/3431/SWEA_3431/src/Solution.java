/* No.3431
   Author : DDing
   Type : Math
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int L, U, X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            U = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());

            sb.append("#" + tc + " ");
            if (X < L) sb.append(L - X);
            else if (X > U) sb.append(-1);
            else sb.append(0);

            sb.append('\n');
        }
        System.out.print(sb);
    }
}
