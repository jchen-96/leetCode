package Code_99_LuanShua;

//https://leetcode-cn.com/problems/robot-return-to-origin/


//no need to read
public class Code_0657 {
    public boolean judgeCircle(String moves) {
        char[] cc=moves.toCharArray();
//        R,L,U,D
        int[] res=new int[4];
        for(char c:cc){
            if(c=='R'){
                res[0]++;
            }
            if(c=='L'){
                res[1]++;
            }
            if(c=='U'){
                res[2]++;
            }
            if(c=='D'){
                res[3]++;
            }
        }
        if(res[0]==res[1]&&res[2]==res[3])
            return true;
        return false;
    }
}
