/* No.1976
   Author : DDing
   Type : Math
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int aHour = Integer.parseInt(st.nextToken());
            int aMin = Integer.parseInt(st.nextToken());
            int bHour = Integer.parseInt(st.nextToken());
            int bMin = Integer.parseInt(st.nextToken());
            int resHour;
            int resMin;

            resMin = (aMin + bMin) % 60;
            resHour = (aHour + bHour + (aMin + bMin) / 60) > 12 ? (aHour + bHour + (aMin + bMin) / 60) - 12 : (aHour + bHour + (aMin + bMin) / 60) % 12;
            sb.append("#" + tc + " " + resHour + " " + resMin + '\n');
        }
        System.out.print(sb);
    }
}
