package weekContest.week145;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//　no need to read

public class Code_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        for(int a:arr1){
            if(hashmap.containsKey(a)) {
                int temp = hashmap.get(a);
                hashmap.put(a, ++temp);
            }else{
                hashmap.put(a,1);
            }
        }
        int i=0;
        for(int a:arr2){
            if(hashmap.containsKey(a)){
                int val=hashmap.get(a);
                while (val>0){
                    arr1[i]=a;
                    i++;
                    val--;

                }
                hashmap.remove(a);
            }
        }
        int j=0;
        int k=0;
        int[] arr3=new int[arr1.length];
        for(Integer a:hashmap.keySet()){
            int val=hashmap.get(a);
            while (val>0) {
                arr3[j++] = a;
                val--;
                k++;
            }
        }
        Arrays.sort(arr3,0,k);
        for(int m=0;m<k;m++){
            arr1[i]=arr3[m];
            i++;
        }
        return arr1;
    }
}
