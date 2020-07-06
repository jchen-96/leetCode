import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        System.out.println(getRes(s1,s2));

    }
    private static int getRes(String s1,String s2){
        if(s1==null||s2==null)
            return 0;
        if(s1.length()<s2.length())
            return 0;
        return minWindow(s1,s2);
    }

    public static int minWindow(String s, String p) {
        int L=0;int R=0;
        int start=0;
        int min_len=-1;
        Map<Character,Integer> windows=new HashMap<>();
        Map<Character,Integer> needp=new HashMap<>();
        for(int i=0;i<p.length();i++){
            needp.put(p.charAt(i),
                    needp.getOrDefault(p.charAt(i),0)+1);
        }
        int size=needp.size();
        int match=0;
        while (R<s.length()){
            char c=s.charAt(R);
            if(needp.containsKey(c)){
                windows.put(c,
                        windows.getOrDefault(c,0)+1);
                if(windows.get(c).intValue()==needp.get(c).intValue()){
                    match++;
                }
            }
            R++;
            while (match==size){
                if(R-L<min_len||min_len==-1){
                    min_len=R-L;
                }
                char c1=s.charAt(L);
                if(needp.containsKey(c1)){
                    windows.put(c1,windows.get(c1)-1);
                    if(windows.get(c1)<needp.get(c1)){
                        match--;
                    }
                }
                L++;
            }
        }
        return min_len==-1?0:min_len;
    }


}

