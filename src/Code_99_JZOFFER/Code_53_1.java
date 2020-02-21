package Code_99_JZOFFER;

//还是二分查找。我懒得写，直接写出来算了
public class Code_53_1 {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=i)
                return i;
        return nums.length;
    }
}
