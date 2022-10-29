/* No.6730
   Author : DDing
   Type : Sweeping
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

    static int T, N;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            stack = new Stack<>();
            int upMax = 0;
            int downMax = 0;

            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int cur = Integer.parseInt(st.nextToken());
                if (stack.isEmpty()) {
                    stack.push(cur);
                    continue;
                }

                if (stack.peek() <= cur) {
                    upMax = Math.max(upMax, cur - stack.peek());
                } else downMax = Math.max(downMax, stack.peek() - cur);

                stack.push(cur);
            }

            sb.append("#" + tc + " " + upMax + " " + downMax + '\n');
        }
        System.out.print(sb);
    }
}
