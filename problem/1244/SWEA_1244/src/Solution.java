import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static int T;
    static int[] list;
    static int cnt = 0;
    static int result = 0;

    public static void solve(int s, int e) {
        if (e == cnt) {
            result = Math.max(result, Integer.parseInt(Arrays.toString(list).replaceAll("[^0-9]", "")));
            return;
        }

        for (int i = s; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                swap(i, j);
                solve(i, e + 1);
                swap(i, j);
            }
        }
    }

    public static void swap(int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            list = null;
            result = 0;
            cnt = 0;

            st = new StringTokenizer(br.readLine());
            String change = st.nextToken();

            cnt = Integer.parseInt(st.nextToken());

            if (cnt > change.length()) cnt = change.length();

            list = new int[change.length()];

            for (int i = 0; i < change.length(); i++) list[i] = change.charAt(i) - '0';

            solve(0, 0);

            sb.append("#" + tc + " " + result + '\n');
        }
        System.out.print(sb);
    }
}