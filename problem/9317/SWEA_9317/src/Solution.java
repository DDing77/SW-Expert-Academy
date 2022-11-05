/* No.9317
   Author : DDing
   Type : string
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            String parent = br.readLine();
            String pattern = br.readLine();

            int res = 0;
            for (int i = 0; i < parent.length(); i++) {
                if (parent.charAt(i) == pattern.charAt(i)) res++;
            }
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
