package Code_01_arrayProblem;

import java.util.HashMap;
import java.util.Map;

public class Code_1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map=new HashMap<>();
        for (char c:chars.toCharArray()){
            int count=map.getOrDefault(c,0);
            map.put(c,count+1);
        }
        int res=0;
        for(String s:words){
            Map<Character,Integer> dic=new HashMap<>();
            for (char c:s.toCharArray()){
                int count=dic.getOrDefault(c,0);
                dic.put(c,count+1);
            }
            if(dic.size()<=map.size()){
                boolean flag=true;
                for(char c:dic.keySet()){
                    if(map.get(c)==null||map.get(c)<dic.get(c)){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    res+=s.length();
            }
        }
        return res;
    }
}
