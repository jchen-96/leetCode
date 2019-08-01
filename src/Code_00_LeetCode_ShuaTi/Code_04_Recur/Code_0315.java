package Code_00_LeetCode_ShuaTi.Code_04_Recur;

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

//https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self/submissions/

//下次有空可以改成数组的形式

public class Code_0315 {
    public List<Integer> countSmaller(int[] nums) {
        if(nums.length<=0){
            return new ArrayList<>();
        }
        List<SimpleEntry<Integer,Integer>> numsE=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            numsE.add(new SimpleEntry<>(nums[i],i));
        }


        int[] count=new int[nums.length];
        mergeSort(numsE,count);
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<count.length;i++){
            result.add(count[i]);
        }
        return result;


    }
    public void mergeSort(List<SimpleEntry<Integer,Integer>> numsE,int[] count){
        mergeSort(numsE,0,numsE.size()-1,count);
    }
    private void mergeSort(List<SimpleEntry<Integer,Integer>> arr,int l,int r,int[] count){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;

        mergeSort(arr,l,mid,count);
        mergeSort(arr,mid+1,r,count);
        merge(arr,l,mid,r,count);

    }

    private void merge(List<SimpleEntry<Integer,Integer>> arr,int l,int mid,int right,int[] count){
        List<SimpleEntry<Integer,Integer>> aux=new ArrayList<>();
        int i=l;
        int j=mid+1;
        int k=0;
        while (k<(right-l+1)){
            k++;
            if(i<=mid&&j<=right){
                if(arr.get(i).getKey()<=arr.get(j).getKey()){
                    aux.add(arr.get(i));
                    count[arr.get(i).getValue()]+=(j-(mid+1));
                    i++;

                }else if(arr.get(i).getKey()>arr.get(j).getKey()){
                    aux.add(arr.get(j));
                    j++;
                }
            }else{
                if(i>mid){
                    aux.add(arr.get(j));
                    j++;
                    continue;
                }
                if(j>right){
                    aux.add(arr.get(i));
                    count[arr.get(i).getValue()]+=(j-(mid+1));
                    i++;
                    continue;
                }
            }
        }
        for(int t=l;t<=right;t++){
            arr.set(t,aux.get(t-l));
        }
    }

    public static void main(String[] args) {
        Code_0315 code_0315=new Code_0315();
        code_0315.countSmaller(new int[]{26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41});
    }
}
