package Code_99_LuanShua;
//https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
//no need to read

public class Code_0852 {
    public int peakIndexInMountainArray(int[] A) {
        if(A.length<3)
            return 0;
        int i=0;
        while (i<A.length-1&&A[i]<A[i+1])
            i++;
        return i;
    }
}
