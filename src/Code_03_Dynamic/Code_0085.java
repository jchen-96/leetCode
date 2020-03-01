package Code_03_Dynamic;

import java.util.Stack;

public class Code_0085 {

    public int maximalRectangle(char[][] matrix) {
        if(matrix==null||matrix.length==0)
            return 0;
        int[] height=new int[matrix[0].length];
        int res=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1')
                    height[j]+=1;
                else
                    height[j]=0;
            }
            res=Math.max(res,largestRectangleArea(height));
        }
        return res;
    }


    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()])
                res = Math.max(res, heights[stack.pop()] * (i - stack.peek() - 1));
            stack.push(i);
        }
        while (stack.peek() != -1)
            res = Math.max(res, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        return res;
    }
}
