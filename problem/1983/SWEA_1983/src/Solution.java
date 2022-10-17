/* No.1983
   Author : DDing
   Type : Math, Sort
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    static String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    static class Info implements Comparable<Info> {
        int idx;
        double total;
        String grade;

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public Info(int idx, double total) {
            this.idx = idx;
            this.total = total;
        }

        @Override
        public int compareTo(Info o) {
            if (o.total > this.total) return 1;
            else return -1;
        }
    }

    static Info[] infos;

    static int T, N, K;

    static double getTotal(int ex1, int ex2, int sub) {
        return ex1 * 0.35 + ex2 * 0.45 + sub * 0.2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            infos = new Info[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                double total = getTotal(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                infos[i] = new Info(i, total);
            }

            Arrays.sort(infos);

            int div = N / 10;
            int gradeIdx = 0;
            for (int i = 0; i < N; i += div) {
                for (int j = i; j < i + div; j++) {
                    infos[j].setGrade(grades[gradeIdx]);
                }
                gradeIdx++;
            }

            for (int i = 0; i < N; i++) {
                if (infos[i].idx == K - 1) sb.append("#" + tc + " " + infos[i].grade + '\n');
            }
        }
        System.out.print(sb);
    }
}
