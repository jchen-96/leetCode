package Code_00_LeetCode_ShuaTi.Code_02_dataStructure;

//https://leetcode-cn.com/problems/kth-largest-element-in-an-array/submissions/

public class Code_0215 {
    public int findKthLargest(int[] nums, int k) {
        int length=nums.length;
        int temp=length-k;
        int l=0;
        int r=length-1;
        int p=partition(nums,l,r);
        while(p!=temp){
            if(p<temp){
                l=p+1;
                p=partition(nums,l,r);
            }else{
                r=p-1;
                p=partition(nums,l,r);
            }
        }
        return nums[p];

    }
    private int partition(int [] arr,int l,int r){
        int rand=(int)(Math.random()*(r-l+1)+l);
        int base=arr[rand];
        arr[rand]=arr[l];
        arr[l]=base;
        int k=l;
        int  i=l+1;
        while(i<=r){
            if(arr[i]<=base){
                swap(arr,k+1,i);
                k++;
                i++;
            }
            else{
                i++;
            }
        }
        swap(arr,l,k);

        return k;
    }
    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
