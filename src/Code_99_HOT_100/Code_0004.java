package Code_99_HOT_100;



public class Code_0004 {


//    hard https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
//    暴力方法合并两个有序数组
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while (i<nums1.length||j<nums2.length){
            if(i==nums1.length){
                arr[k]=nums2[j];
                j++;
                continue;
            }
            if(j==nums2.length){
                arr[k]=nums1[i];
                i++;
                continue;
            }
            if(nums1[i]<nums2[j]) {
                arr[k] = nums1[i];
                i++;
            }else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(arr.length%2==1){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        }
    }

//    使用二分查找的思路!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!可以直接去看题解
//    https://leetcode-cn.com/problems/median-of-two-sorted-arrays/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-2/

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int left=(n+m+1)/2;
        int right=(n+m+2)/2;
        return (getKth(nums1,0,n-1,nums2,0,m-1,left)+
                getKth(nums1,0,n-1,nums2,0,m-1,right))/2.0;
    }



    private int getKth(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int k){
        int len1=end1-start1+1;
        int len2=end2-start2+1;

        if(len1>len2){
            return getKth(nums2,start2,end2,nums1,start1,end1,k);
        }
        if(len1==0){
            return nums2[start2+k-1];
        }
        if(k==1){
            return Math.min(nums1[start1],nums2[start2]);
        }
        int i=start1+Math.min(len1,k/2)-1;
        int j=start2+Math.min(len2,k/2)-1;

        if(nums1[i]>nums2[j]){
            return getKth(nums1,start1,end1,nums2,j+1,end2,k-(j-start2+1));
        }else{
            return getKth(nums1,i+1,end1,nums2,start2,end2,k-(i-start1+1));
        }
    }


}
