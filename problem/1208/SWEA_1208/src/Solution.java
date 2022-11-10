/* No.1208
   Author : DDing
   Type : Greedy
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    static int dumpCnt;
    static List<Integer> boxes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 1; tc <= 10; tc++) {
            dumpCnt = Integer.parseInt(br.readLine());
            boxes = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) boxes.add(Integer.parseInt(st.nextToken()));

            int front;
            int end;
            while (dumpCnt > 0) {
                Collections.sort(boxes);
                front = boxes.remove(0);
                end = boxes.remove(boxes.size() - 1);

                boxes.add(front + 1);
                boxes.add(end - 1);
                dumpCnt--;
            }
            front = boxes.remove(0);
            end = boxes.remove(boxes.size() - 1);
            sb.append("#" + tc + " " + (end - front + 1) + '\n');
        }
        System.out.print(sb);
    }
}

