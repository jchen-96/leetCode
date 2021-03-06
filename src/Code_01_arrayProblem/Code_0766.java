package Code_01_arrayProblem;

public class Code_0766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix==null||matrix.length<=1)
            return true;
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }
}
