package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_095 {
    public static void main(String[] args)throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().split(" ");
        int m=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        if(m!=n){
            System.out.println("false");
            return;
        }
        String s1=reader.readLine();
        String s2=reader.readLine();
        if(s1==null||s2==null){
            System.out.println("false");
            return;
        }
        count(s1,s2);



    }
    private static void count(String s1,String s2){
        if(s1==null||s2==null||s1.length()!=s2.length()){
            System.out.println("false");
            return;
        }
        int[] map=new int[300];
        for(int i=0;i<s1.length();i++){
            map[s1.charAt(i)]++;
        }
        for(int j=0;j<s2.length();j++){
            map[s2.charAt(j)]--;
            if(map[s2.charAt(j)]<0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
