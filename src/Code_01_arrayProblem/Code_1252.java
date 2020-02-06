package Code_01_arrayProblem;

public class Code_1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] arr=new int[n][m];
        for(int[] a:indices){
            for(int i=0;i<m;i++){
                arr[a[0]][i]+=1;
            }
            for(int i=0;i<n;i++){
                arr[i][a[1]]+=1;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((arr[i][j]&1)==1)
                    count++;
            }
        }
        return count;
    }
}
