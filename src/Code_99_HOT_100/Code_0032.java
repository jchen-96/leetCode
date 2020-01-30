package Code_99_HOT_100;

import java.util.Stack;

public class Code_0032 {

    //    暴力解法超时
    public int longestValidParentheses_violence(String s) {
        if (s == null || s.length() <= 1)
            return 0;
        int len = s.length();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')')
                continue;
            for (int j = i + 1; j <= s.length(); j++) {
                if (s.charAt(j - 1) == '(')
                    continue;
                if (isValid(s.substring(i, j)))
                    res = Math.max(res, j - i);
            }
        }
        return res;
    }

    private boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty())
                    return false;
                if (stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(')');
            } else {
                stack.push('(');
            }
        }
        return stack.isEmpty();
    }

    //    动态规划的写法
    public int longestValidParentheses(String s) {
        if (s == null || s.length() <= 1)
            return 0;
        int res = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(')
                    if (i - 2 < 0)
                        dp[i] = 2;
                    else
                        dp[i] = dp[i - 2] + 2;
                else {
                    if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        if (i - dp[i - 1] - 2 >= 0) {
                            dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
                        } else {
                            dp[i] = dp[i - 1] + 2;
                        }
                    }
                }
            }
            res = Math.max(dp[i], res);
        }
        return res;

    }
}
