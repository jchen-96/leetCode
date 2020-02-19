package Code_99_JZOFFER;



public class Code_29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0)
            return new int[0];


        res = new int[matrix.length * matrix[0].length];
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
            res[count++] = arr[start][i];
        }
        //打印右边
        if (start < end1) {
            for (int i = start + 1; i <= end1; i++) {
                res[count++] = arr[i][end2];
            }
        }
        //打印下边
        if (start < end1) {
            for (int i = end2 - 1; i >= start; i--) {
                res[count++] = arr[end1][i];
            }
        }
        //打印左边
        if (start < end2) {
            for (int i = end1 - 1; i > start; i--) {
                res[count++] = arr[i][start];
            }
        }
    }

    private int[] res;
    private int count = 0;
}

