package Code_99_LuanShua;

import java.util.ArrayList;
import java.util.List;
//https://leetcode-cn.com/problems/self-dividing-numbers/
//no need to read

public class Code_0728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> resutl=new ArrayList<>();
        for (int i=left;i<=right;i++){
            if(isValid(i))
                resutl.add(i);
        }
        return resutl;
    }
    private boolean isValid(int i){
        int temp=i;
        while (temp!=0){
            if(temp%10==0)
                return false;
            int rd=temp%10;
            if(i%rd!=0)
                return false;
            temp=temp/10;
        }
        return true;
    }
}
