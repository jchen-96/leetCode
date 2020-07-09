package Code_99_niuke;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_150 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(reader.readLine());
        int[][] maxtrix=new int[n][n];
        for(int i=0;i<n;i++){
            String[] ss=reader.readLine().split(" ");
            for(int j=0;j<n;j++){
                maxtrix[i][j]=Integer.parseInt(ss[j]);
            }
        }
        rotate(maxtrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(maxtrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            doACircle(matrix,i,i,n-i-1,n-i-1);
        }
    }
    private static void doACircle(int[][] matrix,int startx,int starty,int endx,int endy){
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
