/* No.1989
   Author : DDing
   Type : TwoPointer
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            input = br.readLine();

            boolean isPalindrome = true;
            int left = 0;
            int right = input.length() - 1;
            while (left < right) {
                if (input.charAt(left) != input.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            sb.append("#" + tc + " ");
            if (!isPalindrome) sb.append(0).append('\n');
            else sb.append(1).append('\n');
        }

        System.out.print(sb);
    }
}
