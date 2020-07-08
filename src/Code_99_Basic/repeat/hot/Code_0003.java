package Code_99_Basic.repeat.hot;

import java.util.HashSet;
import java.util.Set;

public class Code_0003 {
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        Set<Character> set=new HashSet<>();
        if(s.length()<=1)
            return s.length();
        int res=1;
        int l=0;int r=0;
        while (r<c.length){
            if(set.contains(c[r])) {
                res = Math.max(res, set.size());
                while (l < r && set.contains(c[r])) {
                    set.remove(c[l]);
                    l++;
                }
            }
            set.add(c[r]);
            r++;
        }
        res=Math.max(res,set.size());
        return res;
    }
}
