/* No.2072.홀수만 더하기
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                int cur = Integer.parseInt(st.nextToken());
                if ((cur & 1) == 1) sum += cur;
            }

            sb.append("#" + t + " " + sum + '\n');
        }

        System.out.print(sb);
    }
}
