/* No.1936
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if (a == 1) { // 가위
            if (b == 2) System.out.println("B");
            else System.out.println("A");
        } else if (a == 2) { // 바위
            if (b == 1) System.out.println("A");
            else System.out.println("B");
        } else { // 보
            if (b == 1) System.out.println("B");
            else System.out.println("A");
        }
    }
}
