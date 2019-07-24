package Code_00_LeetCode_ShuaTi.Code_03_Greedy;

//https://leetcode-cn.com/problems/assign-cookies/

import java.util.Arrays;

public class Code_0455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        for(int j=0;i<g.length&&j<s.length;j++) {
            if (g[i] <= s[j]) {
                i++;
            }
        }
        return i;
    }
}
