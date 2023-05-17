import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {

    static HashMap<String, Integer> decodeTable;
    static int T;
    static int N;
    static int M;
    static String input;
    static int oddSum;
    static int evenSum;
    static int cnt;

    public static void getDecodeTable() {
        decodeTable = new HashMap<>();
        decodeTable.put("0001101", 0);
        decodeTable.put("0011001", 1);
        decodeTable.put("0010011", 2);
        decodeTable.put("0111101", 3);
        decodeTable.put("0100011", 4);
        decodeTable.put("0110001", 5);
        decodeTable.put("0101111", 6);
        decodeTable.put("0111011", 7);
        decodeTable.put("0110111", 8);
        decodeTable.put("0001011", 9);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        getDecodeTable();

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            input = "";
            for(int i=0; i<N; i++) {
                input = input + br.readLine();
            }

            oddSum = 0;
            evenSum = 0;
            cnt = 0;

        }
    }
}
