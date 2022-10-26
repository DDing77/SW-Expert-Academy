/* No.1948
   Author : DDing
   Type : Implement
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int aM = Integer.parseInt(st.nextToken());
            int aD = Integer.parseInt(st.nextToken());
            int bM = Integer.parseInt(st.nextToken());
            int bD = Integer.parseInt(st.nextToken());

            int aSum = 0;
            for (int i = 1; i < aM; i++) aSum += day[i];
            aSum += aD;

            int bSum = 0;
            for (int i = 1; i < bM; i++) bSum += day[i];
            bSum += bD;

            sb.append("#" + tc + " " + (bSum - aSum + 1) + '\n');
        }
        System.out.print(sb);
    }
}
