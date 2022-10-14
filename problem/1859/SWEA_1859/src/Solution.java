/* No.1859
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T, N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

            long res = 0;

            int max = arr[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                // 이전것이 클 때
                if (max <= arr[i]) {
                    max = arr[i];
                } else {
                    res += max - arr[i];
                }
            }
            sb.append("#" + tc + " " + res + '\n');
        }

        System.out.print(sb);
    }
}
