/* No.1946
   Author : DDing
   Type : Implement, String
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static int T, N;
    static int[] alpha;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            alpha = new int[26];
            N = Integer.parseInt(br.readLine());
            sb.append("#" + tc + '\n');
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                alpha[st.nextToken().charAt(0) - 'A'] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                while (alpha[i]-- > 0) {
                    sb.append((char) (i + 'A'));
                    cnt++;
                    if (cnt == 10) {
                        sb.append('\n');
                        cnt = 0;
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
