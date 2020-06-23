package Code_99_niuke;

import java.util.*;
import java.io.*;

public class Code_0015{
    public static void main(String[] args)throws Exception{
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String[] s1=sc.readLine().split(" ");
        int n=Integer.parseInt(s1[0]);
        int k=Integer.parseInt(s1[1]);
        String s=sc.readLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s.split(" ")[i]);
        }
        int[] res=windows(arr,k);
        for(int i=0;i<res.length-1;i++)
            System.out.print(res[i]+" ");
        System.out.println(res[res.length-1]);
    }
    private static int[] windows(int[] arr,int k){
        LinkedList<Integer> q=new LinkedList<>();
        if(arr==null||k>arr.length||k<1)
            return null;
        int[] res=new int[arr.length-k+1];
        int index=0;
        for(int i=0;i<arr.length;i++){
            while(!q.isEmpty()&&arr[q.peekLast()]<=arr[i])
                q.pollLast();
            q.addLast(i);
            if(q.peekFirst()==i-k)
                q.pollFirst();
            if(i>=k-1)
                res[index++]=arr[q.peekFirst()];
        }
        return res;
    }
}