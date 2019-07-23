package Code_00_LeetCode_ShuaTi.Code_02_dataStructure;

//https://leetcode-cn.com/problems/basic-calculator/

import java.util.ArrayList;
import java.util.Stack;

//涉及状态转换，好好看看ppt

public class Code_0224 {
    public int calculate(String s) {
        s = s.replace(" ", "");
        ArrayList<String> ss = new ArrayList<>();

//        将字符串切割开来
        for (int i = 0; i < s.length(); ) {
            int start = i;
            if (s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '(' || s.charAt(i) == ')') {
                ss.add(s.substring(i, i + 1));
                i++;
                continue;
            }
            int end = i + 1;
            while (end < s.length() && s.charAt(end) >= '0'
                    && s.charAt(end) <= '9') {
                end++;
            }
            if (end == s.length()) {
                ss.add(s.substring(start));
            } else {
                ss.add(s.substring(start, end));
            }
            i = end;
        }
        Stack<Integer> nums = new Stack<>();
        Stack<String> operators = new Stack<>();
        boolean compute_flag = false;
        for (int i = 0; i < ss.size(); i++) {
            if (isopt(ss.get(i))) {
                if (ss.get(i).equals("+") || ss.get(i).equals("-")) {
                    operators.push(ss.get(i));
                    compute_flag = true;
                } else if (ss.get(i).equals("(")) {
                    compute_flag = false;
                    continue;
                } else {
                    if (!operators.empty()) {
                        int t1 = nums.pop();
                        int t2 = nums.pop();
                        if (operators.peek().equals("+")) {
                            nums.push(t1 + t2);
                        } else {
                            nums.push(t2 - t1);
                        }
                        operators.pop();
                    }
                }
            } else {
                nums.push(Integer.parseInt(ss.get(i)));
                if (compute_flag) {
                    int t1 = nums.pop();
                    int t2 = nums.pop();
                    if (operators.peek().equals("+")) {
                        nums.push(t1 + t2);
                    } else {
                        nums.push(t2 - t1);
                    }
                    operators.pop();
                }
            }
        }
        return nums.pop();

    }

    private boolean isopt(String s) {
        if (s.equals("(") || s.equals(")") || s.equals("+") || s.equals("-")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Code_0224 code_0224 = new Code_0224();
        code_0224.calculate("(1+(4+5+2)-3)+(6+8)");
    }

}
