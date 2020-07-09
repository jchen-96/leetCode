package Code_01_arrayProblem;

public class Code_0048 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            doACircle(matrix,i,i,n-i-1,n-i-1);
        }
    }
    private void doACircle(int[][] matrix,int startx,int starty,int endx,int endy){
        int times=endx-startx;
        for(int i=0;i<times;i++){
            int temp=matrix[startx][starty+i];
            matrix[startx][starty+i]=matrix[endx-i][starty];
            matrix[endx-i][starty]=matrix[endx][endy-i];
            matrix[endx][endy-i]=matrix[startx+i][endy];
            matrix[startx+i][endy]=temp;
        }

    }
}
