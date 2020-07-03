package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_008 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int target=Integer.parseInt(s[1]);
        int[] arr=new int[n];
        s=reader.readLine().trim().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(getRes(arr,target));

    }

    private static int getRes(int[] arr,int target){
        if(target==0)
            return 0;
        int l=0;
        int r=0;
        int sum=0;
        sum+=arr[r];
        int res=-1;
        while (r<arr.length){
            if(sum==target){
                res=Math.max(res,r-l+1);
                r++;
                if(r<arr.length)
                    sum+=arr[r];
            }else if(sum<target){
                r++;
                if(r<arr.length)
                    sum+=arr[r];
            }else{
                sum-=arr[l];
                l++;
            }
        }
        return res;
    }
}
