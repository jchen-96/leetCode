package Code_99_Contest.Contest_156;

import java.util.Arrays;

public class Code_5207 {
    public int equalSubstring(String s, String t, int maxCost) {
        if(s==null||t==null||maxCost<0)
            return 0;
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        int[] diff=new int[ss.length];
        for (int i = 0; i <ss.length ; i++) {
            diff[i]=Math.abs(ss[i]-tt[i]);
            System.out.print(diff[i]+" ");
        }
        int res=0;
        for(int i=0;i<diff.length;i++){
            int temp=maxCost;
            int count=0;
            for(int j=i;temp>=diff[i]&&j<diff.length;j++){
                temp-=diff[j];
                count++;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
