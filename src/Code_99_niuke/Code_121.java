package Code_99_niuke;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_121 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        process(s);
        System.out.println(sb.toString());

    }
    private static StringBuilder sb=new StringBuilder();

    private static void process(String s){
        int[] count=new int[26];
        char[] cc=s.toCharArray();
        for(int i=0;i<cc.length;i++){
            count[cc[i]-'a']++;
        }

        int index=-1;
        for(int i=0;i<cc.length;i++){
            if(count[cc[i]-'a']==1){
                //最后一个了;
                index=i;
                break;
            }else{
                count[cc[i]-'a']--;
            }
        }
        char c='z';
        int minindex=-1;
        for(int i=0;i<=index;i++){
            if(cc[i]<=c){
                c=cc[i];
                minindex=i;
            }
        }
        sb.append(cc[minindex]);
        s=s.substring(minindex,s.length());
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=cc[minindex])
                res.append(s.charAt(i));
        }
        if(res.length()>0)
            process(new String(res));

    }

}
