package Code_01_arrayProblem;

import java.util.ArrayList;
import java.util.Collections;

public class Code_1329 {

//    将对角线的数组考出来，排序，拷回去
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int dLen = m + n - 1;

        ArrayList<Integer>[] diagonal = new ArrayList[dLen];
        for (int i = 0; i < dLen; i++) {
            diagonal[i] = new ArrayList<>(m);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonal[j - i + (m - 1)].add(mat[i][j]);
            }
        }

        for (int i = 0; i < dLen; i++) {
            Collections.sort(diagonal[i]);
        }

        int[][] res = new int[m][n];

        int[] next = new int[dLen];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = j - i + (m - 1);
                res[i][j] = diagonal[index].get(next[index]);
                next[index]++;
            }
        }
        return res;
    }
}
