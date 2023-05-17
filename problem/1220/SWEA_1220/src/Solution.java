import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static final int LENGTH = 100;
    static int N;
    static int[][] map;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 1; tc <= 10; tc++) {
            N = Integer.parseInt(br.readLine());
            map = new int[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < LENGTH; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            cnt = 0;
            for (int j = 0; j < LENGTH; j++) {
                int left = 0;
                int right = left;
                while (left < LENGTH - 1) {

                    boolean isFindN = false;
                    for (int i = left; i < LENGTH; i++) {
                        if (map[i][j] == 1) {
                            left = i;
                            isFindN = true;
                            break;
                        }
                    }

                    if (!isFindN) {
                        break;
                    }

                    right = left + 1;
                    boolean isFindS = false;
                    for (int i = right; i < LENGTH; i++) {
                        if (map[i][j] == 0) {
                            continue;
                        } else if (map[i][j] == 1) {
                            break;
                        } else {
                            right = i;
                            isFindS = true;
                            break;
                        }
                    }

                    if (isFindS) {
                        cnt++;
                        left = right + 1;
                    } else {
                        left = right;
                    }
                }
            }
            sb.append("#" + tc + " " + cnt + '\n');
        }
        System.out.print(sb);
    }
}
