package Code_99_HOT_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_0438 {
    public List<Integer> findAnagrams(String s, String p) {
        int L=0;int R=0;
        int start=0;
        List<Integer> res=new ArrayList<>();
        int min_len=s.length()+10;
        int[] windows=new int[26];
        int[] needp=new int[26];
        for(int i=0;i<p.length();i++){
            needp[p.charAt(i)-'a']++;
        }
        int size=0;
        for(int i=0;i<needp.length;i++){
            if(needp[i]!=0)
                size++;
        }
        int match=0;
        while (R<s.length()){
            char c=s.charAt(R);
            if(needp[c-'a']!=0){
                windows[c-'a']++;
                if(windows[c-'a']==needp[c-'a']){
                    match++;
                }
            }
            R++;
            while (match==size){
                if(R-L==p.length()){
                    res.add(L);
                }
                char c1=s.charAt(L);
                if(needp[c1-'a']!=0){
                    windows[c1-'a']--;
                    if(windows[c1-'a']<needp[c1-'a']){
                        match--;
                    }
                }
                L++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Code_0438 code_0438=new Code_0438();
        code_0438.findAnagrams("cbaebabacd","abc");
    }
}