/* No.6485
   Author : DDing
   Type : Bruteforce, Segment Tree
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int N, P;
    static int startLeaf;
    static int[] tree;

    static void queryTD(int start, int end, int queryLeft, int queryRight, int nodeNum) {
        if (queryLeft > end || queryRight < start) return;
        if (start == end) {
            tree[nodeNum]++;
            return;
        }

        int mid = (start + end) >> 1;

        queryTD(start, mid, queryLeft, queryRight, nodeNum * 2);
        queryTD(mid + 1, end, queryLeft, queryRight, nodeNum * 2 + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());

            startLeaf = 1;
            while (startLeaf < 5000) startLeaf *= 2;
            int length = startLeaf * 2;
            tree = new int[length + 1];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());
                queryTD(1, startLeaf, left, right, 1);
            }

            sb.append("#" + tc + " ");
            P = Integer.parseInt(br.readLine());
            for (int i = 0; i < P; i++) {
                int C = Integer.parseInt(br.readLine());
                sb.append(tree[startLeaf + C - 1] + " ");
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
