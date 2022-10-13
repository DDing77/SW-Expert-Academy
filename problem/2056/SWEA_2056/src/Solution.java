/* No.2056
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            boolean isDate = true;
            String date = br.readLine();
            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6, 8);

            if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) isDate = false;
            else {
                if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > days[Integer.parseInt(month) - 1])
                    isDate = false;
            }

            if (!isDate) sb.append("#" + tc + " ").append(-1).append('\n');
            else sb.append("#" + tc + " ").append(year).append("/").append(month).append("/").append(day).append('\n');
        }

        System.out.print(sb);
    }
}
