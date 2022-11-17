/* No.1221
   Author : DDing
   Type : Implement, Sort
   Ref : https://swexpertacademy.com/main/main.do  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    static HashMap<String, Integer> map;
    static int T;

    static void makeMap() {
        map = new HashMap<>();
        map.put("ZRO", 0);
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THR", 3);
        map.put("FOR", 4);
        map.put("FIV", 5);
        map.put("SIX", 6);
        map.put("SVN", 7);
        map.put("EGT", 8);
        map.put("NIN", 9);
    }

    static class Number {
        String str;
        int num;

        public Number(String str, int num) {
            this.str = str;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        makeMap();
        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            String testNum = st.nextToken();
            int size = Integer.parseInt(st.nextToken());
            ArrayList<Number> numbers = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                String str = st.nextToken();
                numbers.add(new Number(str, map.get(str)));
            }

            Collections.sort(numbers, Comparator.comparing(o -> o.num));

            sb.append("#" + tc + '\n');
            for (Number number : numbers) {
                sb.append(number.str + " ");
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
