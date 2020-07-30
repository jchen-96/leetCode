import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;
import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.*;

class Main {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];

        boolean flag=false;
        for(int i=0;i<dp.length;i++){
            if(flag||text1.charAt(i)==text2.charAt(0)){
                dp[i][0]=1;
                flag=true;
            }
        }
        flag=false;
        for(int i=0;i<dp[0].length;i++){
            if(flag||text2.charAt(i)==text1.charAt(0)){
                dp[0][i]=1;
                flag=true;
            }
        }

        for(int i=1;i<text1.length();i++){
            for(int j=1;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=dp[i-1][j-1];
                }
                dp[i][j]=Math.max(dp[i][j],Math.max(dp[i-1][j],dp[i][j-1]));
            }
        }
        return dp[text1.length()-1][text2.length()-1];

    }
}