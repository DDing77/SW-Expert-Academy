/* No.1225
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution {

    static Deque<Integer> dq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
            dq = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) dq.addLast(Integer.parseInt(st.nextToken()));

            int minus = -1;
            int temp = dq.peekFirst();
            while (temp > 0) {
                temp = dq.pollFirst() + minus--;
                if (temp <= 0) temp = 0;
                dq.addLast(temp);
                if (minus == -6) minus = -1;
                if (dq.peekLast() <= 0) break;
            }

            sb.append("#" + tc);
            while (!dq.isEmpty()) sb.append(" " + dq.pollFirst());
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
