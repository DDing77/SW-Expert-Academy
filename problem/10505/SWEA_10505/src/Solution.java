/* No.10505
   Author : DDing
   Type : Math
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Solution {

    static int T, N;
    static List<Integer> list;
    static ListIterator<Integer> iter;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            list = new ArrayList<>();
            int sum = 0;
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int cur = Integer.parseInt(st.nextToken());
                list.add(cur);
                sum += cur;
            }
            int avg = sum / N;

            int res = 0;
            iter = list.listIterator();
            while (iter.hasNext()) {
                if (iter.next() <= avg) res++;
            }
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
