package Code_99_JZOFFER;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code_38 {
    Set<String> set = new HashSet<>();

    public String[] permutation(String s) {
        if (s == null || s.length() <= 0)
            return new String[]{};
        boolean[] visited = new boolean[s.length()];
        dfs("",s,visited);
        return set.toArray(new String[set.size()]);
    }

    private void dfs(String cur, String s, boolean[] visited) {
        if (cur.length() == s.length()) {
            set.add(cur);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(visited[i])
                continue;
            visited[i]=true;
            dfs(cur+c,s,visited);
            visited[i]=false;
        }
    }
}
