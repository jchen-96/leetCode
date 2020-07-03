package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_094 {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine().trim());
//        reader.close();
//        int[] record=new int[n];
//        for(int i=1;i<=14;i++)
//        System.out.println(getRes(n,record,0));
        res();
    }
    private static int getRes(int n,int[] record,int i ){
        if(i==n)
            return 1;
        int res=0;
        for(int j=0;j<n;j++){
            if(isValid(record,i,j)){
                record[i]=j;
                res+=getRes(n,record,i+1);
            }
        }
        return res;
    }
    private static boolean isValid(int[] r,int i,int j){
        for(int k=0;k<i;k++){
            if(r[k]==j||Math.abs(r[k]-j)==Math.abs(k-i))
                return false;
        }
        return true;
    }
    private static void res(){
        for(int i=1;i<=14;i++){
            System.out.print(getRes(i,new int[i],0)+",");
        }
    }
}
