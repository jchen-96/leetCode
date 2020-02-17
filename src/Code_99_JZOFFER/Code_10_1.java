package Code_99_JZOFFER;

public class Code_10_1 {
    public int fib(int n) {
        int[] arr=new int[2];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i%2]=(arr[0]+arr[1])%1000000007;
        }
        return arr[n%2];
    }
}
