import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static int T;
    static int num;
    static int cnt;
    static Set<Integer> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            set = new HashSet<>();

            num = Integer.parseInt(br.readLine());
            cnt = 1;
            int copy = num;

            while (set.size() < 10) {
                int temp = copy;
                while (temp > 0) {
                    set.add(temp % 10);
                    temp /= 10;
                }

                if (set.size() == 10) {
                    break;
                }

                cnt++;
                copy = cnt * num;
            }

            sb.append("#" + tc + " " + copy + '\n');
        }
        System.out.print(sb);
    }
}
