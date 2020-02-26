package Code_99_JZOFFER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_57_2 {
    public int[][] findContinuousSequence(int target) {
        int[] seq=new int[target];
        int l=1;int r=2;
        int sum=0;
        sum+=l;
        sum+=r;
        int count=0;
        List<int[]> res=new ArrayList<>();
        while (r<=target/2+1){
            if(sum==target){
                int[] temp=new int[r-l+1];
                for(int i=l;i<=r;i++)
                    temp[i-l]=i;
                res.add(Arrays.copyOfRange(temp,0,temp.length));
                r++;
                sum+=r;
            }
            if(sum<target){
                r++;
                sum+=r;
            }
            if(sum>target){
                sum-=l;
                l++;
            }
        }
        int[][] result=new int[res.size()][];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Code_57_2 code_57_2=new Code_57_2();
        code_57_2.findContinuousSequence(9);
    }
}
