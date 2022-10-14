/* No.1926
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String temp = String.valueOf(i);

            boolean isCheck = false;
            for (int j = 0; j < temp.length(); j++) {
//                System.out.println("temp : " + temp + ", j : " + j + ", " + (temp.charAt(j) - '0'));
                if ((temp.charAt(j) - '0') % 3 == 0 && (temp.charAt(j) - '0' != 0)) {
                    isCheck = true;
                    sb.append('-');
                }
            }

            if (!isCheck) sb.append(i + " ");
            else sb.append(" ");
        }

        System.out.println(sb);
    }
}
