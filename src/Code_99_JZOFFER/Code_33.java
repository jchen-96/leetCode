package Code_99_JZOFFER;

public class Code_33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder==null||postorder.length<=1)
            return true;
        return validate(postorder,0,postorder.length-1);
    }
    private boolean validate(int[] arr,int start,int end){
        if(start==end||end<start)
            return true;
        int t=arr[end];
        int index;
        int i;
        for(i=start;i<end;i++){
            if(arr[i]>t)
                break;
        }
        index=i-1;
        for(;i<end;i++){
            if(arr[i]<t)
                return false;
        }
        return validate(arr,start,index)&&validate(arr,index+1,end-1);
    }

    public static void main(String[] args) {
        Code_33 code_33=new Code_33();
        code_33.verifyPostorder(new int[]{4, 6, 7, 5});
    }
}
