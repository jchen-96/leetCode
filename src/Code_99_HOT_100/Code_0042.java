package Code_99_HOT_100;

public class Code_0042 {

//    https://leetcode-cn.com/problems/trapping-rain-water/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-8/
//    方法一 会超时
    public int trap1(int[] height) {
        if(height==null||height.length==0)
            return 0;
        int res=0;
        int max_height=getMaxHeight(height);
        for(int i=0;i<=max_height;i++){
            boolean update=false;
            int temp=0;
            for(int j=0;j<height.length;j++){
                if(update&&height[j]<i){
                    temp++;
                }
                if(height[j]>=i){
                    update=true;
                    res+=temp;
                    temp=0;
                }
            }
        }
        return res;

    }
    private int getMaxHeight(int[] height){
        int max=-1;
        for(int i=0;i<height.length;i++){
            max=Math.max(height[i],max);
        }
        return max;
    }

//    采用动态规划的方法，依次求出每个位置左边和右边位置的最高位
    public int trap(int[] height){
        if(height==null||height.length<=1)
            return 0;
        int res=0;
        int[] maxLeft=new int[height.length];
        int[] maxRight=new int[height.length];
        for(int i=1;i<height.length;i++){
            maxLeft[i]=Math.max(height[i-1],maxLeft[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
            maxRight[i]=Math.max(height[i+1],maxRight[i+1]);
        }
        for(int i=1;i<height.length-1;i++){
            int min=Math.min(maxLeft[i],maxRight[i]);
            if(min>height[i])
                res+=(min-height[i]);
        }
        return res;

    }
}
