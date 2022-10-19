/* No.1959
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.NotLinkException;
import java.util.StringTokenizer;

public class Solution {

    static int T, N, M;
    static int[] arrN;
    static int[] arrM;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());


            arrN = new int[N];
            arrM = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) arrN[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) arrM[i] = Integer.parseInt(st.nextToken());

            int max = Integer.MIN_VALUE;
            if (N <= M) {
                for (int i = 0; i <= M - N; i++) {
                    int sum = 0;
                    for (int j = 0; j < N; j++) {
                        sum += arrN[j] * arrM[j + i];
                    }
                    max = Math.max(sum, max);
                }
            } else {
                for (int i = 0; i <= N - M; i++) {
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum += arrM[j] * arrN[j + i];
                    }
                    max = Math.max(sum, max);
                }
            }


            sb.append("#" + tc + " " + max).append('\n');
        }
        System.out.print(sb);
    }
}
