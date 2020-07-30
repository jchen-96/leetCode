package Code_99_JZOFFER;

public class Code_21 {
    public int[] exchange(int[] nums) {
        int odd=0;
        while (nums[odd]%2==1)
            odd++;
        int j=odd;
        while (j<nums.length){
            if(nums[j]%2==0)
                j++;
            else{
                swap(nums,j,odd);
                odd++;
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
