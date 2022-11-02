/* No.10570
   Author : DDing
   Type : Math, String
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T, A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            int res = 0;
            for (int i = A; i <= B; i++) {
                if (i % Math.sqrt(i) != 0) continue;

                int left;
                int right;
                boolean isPalindrome;
                String sqrtToStr = String.valueOf((int) Math.sqrt(i));
                left = 0;
                right = sqrtToStr.length() - 1;
                isPalindrome = true;
                while (left < right) {
                    if (sqrtToStr.charAt(left) == sqrtToStr.charAt(right)) {
                        left++;
                        right--;
                    } else {
                        isPalindrome = false;
                        break;
                    }
                }

                if (!isPalindrome) continue;

                String iToStr = String.valueOf(i);
                left = 0;
                right = iToStr.length() - 1;
                isPalindrome = true;
                while (left < right) {
                    if (iToStr.charAt(left) == iToStr.charAt(right)) {
                        left++;
                        right--;
                    } else {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) res++;
            }

            sb.append("#" + tc + " " + res + '\n');
        }
        System.out.print(sb);
    }
}
