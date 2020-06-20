package Code_99_LuanShua;

import java.util.*;


public class Code_0820 {

    //暴力解法
    public int minimumLengthEncoding1(String[] words) {
        int res=0;
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            if(set.contains(words[i]))
                continue;
            if(set.isEmpty()){
                set.add(words[i]);
                res+=words[i].length();
                res++;
                continue;
            }
            String s=words[i];
            boolean falg=false;
            for(String h:set){
                if(h.endsWith(s)){
                    falg=true;
                    break;
                }
            }
            if(!falg){
                set.add(s);
                res+=words[i].length();
                res++;
            }
        }
        return res;

    }
    //
    public int minimumLengthEncoding(String[] words) {
        Set<String> set=new HashSet<>();
        for(String s:words)
            set.add(s);
        for(String s:words)
            for(int i=1;i<s.length();i++)
                set.remove(s.substring(i));
        int res=0;
        for(String s:set)
            res+=s.length();
        return res+set.size();

    }

    public static void main(String[] args) {
        new Code_0820().minimumLengthEncoding(new String[]{"time", "me", "bell"});
    }
}
