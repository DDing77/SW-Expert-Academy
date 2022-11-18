/* No.15230
   Author : DDing
   Type : String
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            input = br.readLine();

            int cnt = 0;
            for (int i = 0; i < input.length(); i++) {
                if (i == input.charAt(i) - 'a') cnt++;
                else break;
            }
            sb.append("#" + tc + " " + cnt + '\n');
        }
        System.out.print(sb);
    }
}
