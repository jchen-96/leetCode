package Code_01_arrayProblem;

import java.util.ArrayList;

public class Code_0054 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length<=0)
            return new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i * 2 < m && i * 2 < n; i++) {
            outCircle(matrix, i, m, n);
        }
        return res;

    }

    private void outCircle(int[][] arr, int start, int m, int n) {
        int end1 = m - start - 1;
        int end2 = n - start - 1;

        //打印上面一行
        for (int i = start; i <= end2; i++) {
            res.add(arr[start][i]);
        }
        //打印右边
        if (start < end1) {
            for (int i = start + 1; i <= end1; i++) {
                res.add(arr[i][end2]);
            }
        }
        //打印下边
        if (start < end1) {
            for (int i = end2 - 1; i >= start; i--) {
                res.add(arr[end1][i]);
            }
        }
        //打印左边
        if (start < end2) {
            for (int i = end1 - 1; i > start; i--) {
                res.add(arr[i][start]);
            }
        }
    }

    private ArrayList<Integer> res;
}
