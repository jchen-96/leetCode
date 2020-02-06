package Code_01_arrayProblem;

public class Code_1217 {
    public int minCostToMoveChips(int[] chips) {
        int t1=0;
        int t2=0;
        for(int i:chips){
            if((i&1)==0)
                t1++;
            else
                t2++;
        }
        return Math.min(t1,t2);
    }
}
