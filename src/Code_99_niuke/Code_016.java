package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Code_016 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            s = reader.readLine().split(" ");
            for (int j = 0; i < m; j++) {
                arr[i][j] = Integer.parseInt(s[i]);
            }
        }
        System.out.println(getMax(arr));


    }

    private static int getMax(int[][] arr) {
        if (arr == null || arr.length <= 0)
            return 0;
        int[] buttom = new int[arr[0].length];
        int maxArea = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                buttom[j] = arr[i][j] == 1 ? buttom[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, getMax2(buttom));
        }
        return maxArea;

    }

    private static int getMax2(int[] arr) {
        int maxArea = -1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int cur = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max((cur - left - 1) * arr[cur], maxArea);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            int right = arr.length;
            int left = stack.isEmpty() ? -1 : stack.peek();
            maxArea = Math.max(maxArea, (right - left - 1) * arr[cur]);
        }
        return maxArea;
    }


}
