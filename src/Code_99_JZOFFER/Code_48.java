package Code_99_JZOFFER;

import java.util.HashMap;

public class Code_48 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int length=s.length();
        char[] array=s.toCharArray();
        int l=0;
        int r=-1;
        int resutl=0;
        while(l<length){
            if(r+1<length&&!map.containsKey(array[r+1])){
                r++;
                map.put(array[r],1);
            }else{
                map.remove(array[l]);
                l++;
            }
            resutl=Math.max(resutl,r-l+1);
        }
        return resutl;
    }
}
