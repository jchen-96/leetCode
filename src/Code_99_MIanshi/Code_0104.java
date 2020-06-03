package Code_99_MIanshi;

import java.util.HashMap;
import java.util.Map;

public class Code_0104 {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        boolean odd=s.length()%2==0?true:false;
        int count=0;
        for(Character c:map.keySet()){
            if(map.get(c)%2==1){
                if(odd)
                    return false;
                if(count==1)
                    return false;
                if(!odd&&count==0)
                    count++;
            }
        }
        return true;
    }
}
