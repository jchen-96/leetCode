package Code_99_LuanShua;

//no need to read

public class Code_0509 {
    public int fib(int N) {
        int[] arr=new int[100];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<=N;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[N];
    }
}
