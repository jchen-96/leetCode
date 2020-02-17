package Code_99_JZOFFER;

public class Code_21 {
    public int[] exchange(int[] nums) {
        if(nums==null||nums.length<=1)
            return nums;
        int k=0;
        while (k<nums.length&&nums[k]%2==1){
            k++;
        }
        int j=k;
        while (j<nums.length){
            if(nums[j]%2==0){
                j++;
            }else{
                swap(nums,k,j);
                k++;
                j++;
            }
        }

        return nums;

    }
    private void  swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
