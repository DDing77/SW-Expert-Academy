/* No.4406
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static char[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");

            input = br.readLine().toCharArray();
            for (int i = 0; i < input.length; i++) {
                char cur = input[i];
                if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u') continue;
                sb.append(cur);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
