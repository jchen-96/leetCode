package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_096 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        String s1=reader.readLine();
        String s2=reader.readLine();
        if(s1==null&&s2==null){
            System.out.println("YES");
            return;
        }
        if(s1.length()==0&&s2.length()==0){
            System.out.println("YES");
            return;
        }
        if(s1.length()!=s2.length()){
            System.out.println("NO");
            return;
        }
        String b=s1+s2;
        System.out.println(b.contains(s1)?"YES":"NO");

    }
}
