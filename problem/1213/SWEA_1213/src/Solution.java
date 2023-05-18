import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static String pattern;
    static String parent;
    static int[] table;
    static int res;

    public static void makeTable() {
        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                table[i] = ++j;
            }
        }
    }

    public static void kmp() {
        int j = 0;
        for (int i = 0; i < parent.length(); i++) {
            while (j > 0 && parent.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }

            if (parent.charAt(i) == pattern.charAt(j)) {
                if (j == pattern.length() - 1) {
                    res++;
                    j = table[j];
                } else {
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            String t = br.readLine();

            pattern = br.readLine();
            parent = br.readLine();

            table = new int[pattern.length()];

            res = 0;
            makeTable();
            kmp();

            sb.append("#" + tc + " " + res).append('\n');
        }
        System.out.print(sb);
    }
}
