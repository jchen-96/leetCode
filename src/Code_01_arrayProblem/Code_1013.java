package Code_01_arrayProblem;

public class Code_1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        if(A==null||A.length<=0)
            return true;
        int sum=0;
        for(int i:A)
            sum+=i;
        if(sum%3!=0)
            return false;
        int target=sum/3;
        int i=0;
        int cur=0;
        while (i<A.length){
            cur+=A[i];
            if(cur==target)
                break;
            i++;
        }
        if(cur!=target)
            return false;
        int j=i+1;
        while (j<A.length-1){
            cur+=A[j];
            if(cur==target*2)
                return true;
            j++;
        }

        return false;
    }
}
