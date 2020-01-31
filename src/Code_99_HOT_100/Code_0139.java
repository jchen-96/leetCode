package Code_99_HOT_100;

import java.util.*;


//暴力搜索改进成记忆搜索就行了
public class Code_0139 {
    private int[] mem;

    public boolean wordBreak(String s, List<String> wordDict) {
        mem = new int[s.length() + 1];
        mem[s.length()]=1;
        word_Break(s, new HashSet<>(wordDict), 0);
        return mem[0]==1;
    }

    private boolean word_Break(String s, Set<String> set, int start) {
        if (mem[start]==1)
            return true;
        if(mem[start]==2)
            return false;
        if (start == s.length())
            return true;
        for (int end = start + 1; end <= s.length(); end++) {
            if (set.contains(s.substring(start, end)) && word_Break(s, set, end)) {
                mem[start]=1;
                return true;
            }
        }
        mem[start]=2;
        return false;
    }


}
