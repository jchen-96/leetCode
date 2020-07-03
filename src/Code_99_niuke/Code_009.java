package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Code_009 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int[] arr=new int[n];
        int target=Integer.parseInt(s[1]);
        s=reader.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(getRes(arr,target));

    }
    private static int getRes(int[] arr,int target){
        int sum=0;
        int res=-1;
        Map<Integer,Integer>  map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-target)){
                res=Math.max(res,i-map.get(sum-target));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return res;
    }
}
