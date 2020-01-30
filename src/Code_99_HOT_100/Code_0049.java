package Code_99_HOT_100;

import java.util.*;

public class Code_0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] cc=strs[i].toCharArray();
            Arrays.sort(cc);
            sorted[i]=new String(cc);
        }
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            if(map.containsKey(sorted[i])) {
                List<String> s =map.get(sorted[i]);
                s.add(strs[i]);
            }else{
                List<String> s=new ArrayList<>();
                s.add(strs[i]);
                map.put(sorted[i],s);
            }
        }
        List<List<String>> res=new ArrayList<>();
        Set<String> set=map.keySet();
        for(String s:set){
            res.add(map.get(s));
        }
        return res;
    }
}
