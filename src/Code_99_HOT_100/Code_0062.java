package Code_99_HOT_100;

public class Code_0062 {
    public int uniquePaths(int m, int n) {
        int t1=m+n-2;
        int t2=m>n?m-1:n-1;
        return C_m_n(t2,t1);
    }
    private int C_m_n(int m,int n){
        long res=1;
        for(int i=m+1;i<=n;i++)
            res*=i;
        for(int i=2;i<=(n-m);i++)
            res/=i;
        return (int)res;
    }

    public static void main(String[] args) {
        Code_0062 code_0062=new Code_0062();
        code_0062.uniquePaths(10,10);
    }
}
