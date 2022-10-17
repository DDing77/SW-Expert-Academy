/* No.1984
   Author : DDing
   Type : Math, Sort
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            arr = new int[10];

            double sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            Arrays.sort(arr);

            sum -= arr[0] + arr[9];

            sb.append("#" + tc + " " + (int) Math.round(sum / 8) + '\n');
        }
        System.out.print(sb);
    }
}

