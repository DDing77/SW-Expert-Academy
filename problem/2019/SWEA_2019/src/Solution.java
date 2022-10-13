/* No.2019
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        a = Integer.parseInt(br.readLine());

        for (int i = 0; i <= a; i++) {
            sb.append(1 * (int) Math.pow(2, i) + " ");
        }

        System.out.println(sb);
    }
}
