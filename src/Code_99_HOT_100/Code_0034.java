package Code_99_HOT_100;


//https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
//二分查找问题
public class Code_0034 {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[]{-1,-1};
        if(nums==null||nums.length==0)
            return res;
        res[0]=findLeft(nums,target,0,nums.length-1);
        res[1]=findRight(nums,target,0,nums.length-1);
        return res;
    }
    private int findLeft(int[] nums,int target,int l,int r){
        if(l>r)
            return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]>target)
            return findLeft(nums,target,l,mid-1);
        else if(nums[mid]<target)
            return findLeft(nums,target,mid+1,r);
        else{
            if(mid==0||nums[mid-1]!=target)
                return mid;
            return findLeft(nums,target,l,mid-1);
        }
    }
    private int findRight(int[] nums,int target,int l,int r){
        if(l>r)
            return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]>target)
            return findRight(nums,target,l,mid-1);
        else if(nums[mid]<target)
            return findRight(nums,target,mid+1,r);
        else{
            if(mid==nums.length-1||nums[mid+1]!=target)
                return mid;
            return findRight(nums,target,mid+1,r);
        }
    }
}
