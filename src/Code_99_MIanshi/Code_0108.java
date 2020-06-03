package Code_99_MIanshi;


//no need to read
public class Code_0108 {
    public void setZeroes(int[][] matrix) {
        boolean[] hang=new boolean[matrix.length];

        boolean[] lie=new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) {
                    hang[i] = true;
                    lie[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(hang[i]||lie[j]) {
                    matrix[i][j]=0;
                }
            }
        }

    }
}
