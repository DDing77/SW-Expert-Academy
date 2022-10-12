/* No.2071
   Author : DDing
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            double sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) sum += Integer.parseInt(st.nextToken());
            sb.append("#" + tc + " " + Math.round(sum / 10) + '\n');
        }
        System.out.print(sb);
    }
}

