import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {

    static int T;
    static String encoded;
    static String res;

    public String getBinary6Bit(char ch) {
        String res = "";

        if ('A' <= ch && ch <= 'Z') {
            res = Integer.toBinaryString(ch - 65);
        } else if ('a' <= ch && ch <= 'z') {
            res = Integer.toBinaryString(ch - 71);
        } else if ('0' <= ch && ch <= '9') {
            res = Integer.toBinaryString(ch + 4);
        } else if (ch == '/') {
            res = Integer.toBinaryString(ch + 16);
        } else if (ch == '+') {
            res = Integer.toBinaryString(ch + 19);
        }

        while (res.length() < 6) {
            res = "0" + res;
        }

        return res;
    }


    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            encoded = br.readLine();
            String temp = "";

            for (int i = 0; i < encoded.length(); i++) {
                temp += getBinary6Bit(encoded.charAt(i));
            }

            sb.append("#" + tc + " ");
            res = "";
            for (int i = 0; i < temp.length() - 8; i += 8) {
                res += (char) Integer.parseInt(temp.substring(i, i + 8), 2);
            }

            sb.append(res + ".").append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Solution().solution();
    }
}
