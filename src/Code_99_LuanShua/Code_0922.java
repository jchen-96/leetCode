package Code_99_LuanShua;

//no need to read
//不开辟空间的做法还是可以看一下



public class Code_0922 {
    public int[] sortArrayByParityII(int[] A) {
        int j=1;
        for (int i = 0; i <A.length ; i+=2) {
            if(A[i]%2==1){
                while (A[j]%2==1){
                    j+=2;
                }
                A[i]=A[i]^A[j];
                A[j]=A[i]^A[j];
                A[i]=A[i]^A[j];
            }
        }
        return A;
    }
}