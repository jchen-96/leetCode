package Code_99_Basic.repeat.hot;

public class Code_0415 {
    public String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int i = c1.length - 1;
        int j = c2.length - 1;
        boolean f = false;
        StringBuilder sb = new StringBuilder();
        while (j >= 0 || i >= 0) {
            int t = f ? 1 : 0;
            f = false;
            if (i < 0) {
                t += c2[j] - '0';
                j--;
            } else if (j < 0) {
                t += c1[i] - '0';
                i--;
            } else if (i >= 0 && j >= 0) {
                t += c1[i] + c2[j] - '0' - '0';
                i--;
                j--;
            }
            if (t >= 10) {
                f = true;
                t = t % 10;
            }
            sb.append("" + t);
        }
        if (f) {
            sb.append("1");
        }

        if (sb.length() == 0)
            sb.append("0");
        return new String(sb.reverse());
    }
}
