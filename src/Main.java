import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        while (n>0){
            String ss=bf.readLine();
            String[] kn=ss.split(" ");
            int N=Integer.valueOf(kn[0]);
            int K=Integer.valueOf(kn[1]);
            BigInteger M=BigInteger.valueOf(Integer.parseInt(kn[2]));
            String scores=bf.readLine();
            int temp=0;
            char[] score=scores.toCharArray();
            for(int i=0;i<score.length;i++){
                if(score[i]=='0'){
                    temp++;
                }
            }
            if(K>=temp){
                int tt=N-temp;
                BigInteger res=M.multiply(BigInteger.valueOf(tt));
                System.out.println(res);
            }else{
                int tt=N-temp-temp+K;
                BigInteger res=M.multiply(BigInteger.valueOf(tt));
                System.out.println(tt>0?res:0);
            }
            n--;

        }
    }

}
