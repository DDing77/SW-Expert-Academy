/* No.15758
   Author : DDing
   Type : String
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int TC;
    static String S, T;

    static int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        TC = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= TC; tc++) {
            st = new StringTokenizer(br.readLine());
            S = st.nextToken();
            T = st.nextToken();

            int sLength = S.length();
            int tLength = T.length();
            int gcd = getGCD(sLength, tLength);
            int lcm = sLength * (tLength / gcd);

            String newS = "";
            while (newS.length() < lcm) newS += S;
            String newT = "";
            while (newT.length() < lcm) newT += T;

            sb.append("#" + tc + " ");
            if (newS.equals(newT)) sb.append("yes" + "\n");
            else sb.append("no" + '\n');
        }
        System.out.print(sb);
    }
}
