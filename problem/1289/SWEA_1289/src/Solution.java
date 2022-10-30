/* No.1289
   Author : DDing
   Type : Implement, Stack
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static char[] original;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int res = 0;
            original = br.readLine().toCharArray();
            char preChanged = '0';

            for (int i = 0; i < original.length; i++) {
                if (original[i] == preChanged) continue;
                else {
                    preChanged = original[i];
                    res++;
                }
            }
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
// 1 1
// 2 0
// 3 1
// 4 0
// 5 1
