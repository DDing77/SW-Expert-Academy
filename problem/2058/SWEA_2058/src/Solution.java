/* No.2058
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int res = 0;
        while (N > 0) {
            res += N % 10;
            N /= 10;
        }

        System.out.println(res);
    }
}
