package Code_01_arrayProblem;

//too easy

public class Code_0832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int l=0,r=A[i].length-1;
            while (l<=r){
                if(A[i][l]==A[i][r])
                    A[i][l]=A[i][r]=(1^A[i][l]);

                l++;
                r--;
            }
        }
        return A;
    }

}
