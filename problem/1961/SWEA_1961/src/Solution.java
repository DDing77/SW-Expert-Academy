import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int N;
    static int[][] origin;
    static int[][] temp;

    static String[][] res;

    static void rotate(int startR) {

        // 위 -> 오른쪽
        for (int i = startR; i < N - startR; i++) {
            temp[i][N - startR - 1] = origin[startR][i];
        }

        // 오른쪽 -> 아래
        for (int i = startR; i < N - startR; i++) {
            temp[N - startR - 1][i] = origin[N - 1 - i][N - startR - 1];
        }

        // 아래 -> 왼쪽
        for (int i = startR; i < N - startR; i++) {
            temp[i][startR] = origin[N - startR - 1][i];
        }

        // 왼쪽 -> 위
        for (int i = startR; i < N - startR; i++) {
            temp[startR][i] = origin[N - 1 - i][startR];
        }
    }

    public void putDateRes(int n) {
        for (int i = 0; i < N; i++) {

            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum = sum * 10 + origin[i][j];
            }

            String sumToStr = String.valueOf(sum);
            while (sumToStr.length() < N) {
                sumToStr = "0" + sumToStr;
            }

            res[i][n] = sumToStr;
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            origin = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    origin[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            res = new String[6][3];
            for (int i = 0; i < 3; i++) {
                temp = new int[N][N];

                for (int j = 0; j <= N / 2; j++) {
                    rotate(j);
                }

                origin = temp;
                putDateRes(i);
            }

            sb.append("#" + tc).append('\n');
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    sb.append(res[i][j] + " ");
                }
                sb.append('\n');
            }
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Solution().solution();
    }
}
