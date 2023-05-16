import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

class Solution {

    static int T;
    static int N;
    static int[][] map;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());

            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("#" + tc + '\n');
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(map[N - j - 1][i]);
                }
                sb.append(" ");

                for (int j = 0; j < N; j++) {
                    sb.append(map[N - i - 1][N - j - 1]);
                }
                sb.append(" ");

                for (int j = 0; j < N; j++) {
                    sb.append(map[j][N - i - 1]);
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