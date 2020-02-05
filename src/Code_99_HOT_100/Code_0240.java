package Code_99_HOT_100;

public class Code_0240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length<=0)
            return false;
        int x=0;
        int y=matrix[0].length-1;
        while (x<matrix.length&&y>=0){
            if(matrix[x][y]>target){
                y--;
            }else if(matrix[x][y]<target){
                x++;
            }else
                return true;
        }
        return false;

    }
}
