package Code_99_MianShiBaoDian;

public class Code_10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        int[] temp=new int[m];
        for(int i=0;i<m;i++)
            temp[i]=A[i];
        int i=0,j=0;
        int k=0;
        while (i<m||j<n){
            if(i==m){
                A[k++]=B[j++];
                continue;
            }
            if(j==n){
                A[k++]=temp[i++];
                continue;
            }
            A[k++]=temp[i]<B[j]?temp[i++]:B[j++];
        }

    }
}
