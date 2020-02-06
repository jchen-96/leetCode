package Code_01_arrayProblem;

public class Code_1304 {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if(n%2==0){
            for(int i=0;i<n;i+=2){
                res[i]=i+1;
                res[i+1]=-(i+1);
            }
        }else{
            res[0]=0;
            for(int i=1;i<n;i+=2){
                res[i]=i;
                res[i+1]=-i;
            }
        }
        return res;
    }
}
