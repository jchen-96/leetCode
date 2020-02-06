package Code_01_arrayProblem;

public class Code_1299 {
    public int[] replaceElements(int[] arr) {
        if(arr==null||arr.length<=0)
            return arr;
        int max=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            int t=arr[i];
            arr[i]=max;
            max=Math.max(max,t);
        }
        return arr;
    }
}
