import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static int N;
    static int[] col;
    static int res;

    public static boolean attack(int myR, int myC, int opponentR, int opponentC) {
        if (myC == opponentC) {
            return true;
        }

        if (myR + myC == opponentR + opponentC) {
            return true;
        }

        if (myR - myC == opponentR - opponentC) {
            return true;
        }

        return false;
    }

    public static void dfs(int curRow) {
        if (curRow == N + 1) {
            res++;
        }

        boolean next;
        for (int c = 1; c <= N; c++) {
            next = true;
            for (int r = curRow - 1; r >= 1; r--) {
                if (attack(curRow, c, r, col[r])) {
                    next = false;
                    break;
                }
            }

            if (next) {
                col[curRow] = c;
                dfs(curRow + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            col = new int[N + 1];

            res = 0;
            dfs(1);

            sb.append("#" + tc + " " + res).append('\n');
        }
        System.out.print(sb);
    }
}
