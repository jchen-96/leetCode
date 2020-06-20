package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_184 {
    static long mod=1000000007;

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.valueOf(bf.readLine());

        System.out.println(f3(n)%mod);
    }

    public static long f3(long n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        long[][] base={{1,1},{1,0}};
        long[][] res=matrixPower(base,n-2);
        return res[0][0]*2%mod+res[1][0]%mod;
    }

    //求一个矩阵的n次方
    private static long[][] matrixPower(long[][] m,long n){
        long[][] res=new long[m.length][m[0].length];
        for(int i=0;i<m.length;i++)
            res[i][i]=1;
        long[][] temp=m;
        for(;n>0;n=n>>1){
            if((n&1)==1){
                res=matMultiply(res,temp);
            }
            temp=matMultiply(temp,temp);
        }
        return res;
    }
    public static long[][] matMultiply(long[][] mat1,long[][] mat2){
        long[][] res = new long[mat1.length][mat2[0].length];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                for(int k = 0; k<mat1[0].length;k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                    res[i][j] %=mod;
                }
            }
        }
        return res;
    }
}
