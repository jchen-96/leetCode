package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_117 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        char[] cs = reader.readLine().toCharArray();
        reversize(cs, 0, size - 1);
        reversize(cs, size, cs.length - 1);
        reversize(cs, 0, cs.length - 1);
        System.out.println(new String(cs));
    }

    private static void reversize(char[] cc, int l, int r) {
        while (l <= r) {
            char c = cc[l];
            cc[l] = cc[r];
            cc[r] = c;
            l++;
            r--;
        }
    }
}