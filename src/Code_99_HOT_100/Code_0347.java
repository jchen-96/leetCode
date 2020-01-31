package Code_99_HOT_100;

import java.util.*;

public class Code_0347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if(nums==null||nums.length<=0)
            return null;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else
                map.put(nums[i],1);
        }
        int[][] arr=new int[map.size()][2];
        int tt=0;
        for(int i:map.keySet()) {
            arr[tt][0] = i;
            arr[tt][1] = map.get(i);
            tt++;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(arr[arr.length-i-1][0]);
        }
        return res;
    }
}
