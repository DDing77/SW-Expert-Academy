/* No.2050
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sb.append(c - 'A' + 1 + " ");
        }
        System.out.println(sb);
    }
}
