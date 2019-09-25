package Code_99_LuanShua;

//https://leetcode-cn.com/problems/letter-tile-possibilities/


//递归回溯，好好看一下!!!!!!
public class Code_1079 {
    public int numTilePossibilities(String tiles) {
        int[] counter=new int[26];
        char[] cc=tiles.toCharArray();
        for (char c:cc) {
            counter[c-'A']+=1;
        }
        return dfs(counter);

    }

    private int dfs(int[] counter){
        int res=0;
        for (int i = 0; i < 26; i++) {
            if(counter[i]==0)
                continue;

            res+=1;
            counter[i]-=1;
            res+=dfs(counter);
            counter[i]+=1;
        }
        return res;

    }
}
