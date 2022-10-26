/* No.1206
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 1; tc <= 10; tc++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 4];
            st = new StringTokenizer(br.readLine());
            for (int i = 2; i < N + 2; i++) arr[i] = Integer.parseInt(st.nextToken());

            int res = 0;
            for (int i = 2; i < N + 2; i++) {
                int max = Math.max(arr[i - 2], Math.max(arr[i - 1], Math.max(arr[i + 1], arr[i + 2])));
                if (arr[i] > max) res += arr[i] - max;
            }
            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
