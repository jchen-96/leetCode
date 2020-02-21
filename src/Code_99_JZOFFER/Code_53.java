package Code_99_JZOFFER;


//懒得二分查找，先AC再说
public class Code_53 {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end&&target!=nums[start])
            start++;
        if(start==end+1)
            return 0;
        while (target!=nums[end])
            end--;
        return end-start+1;
    }
}
