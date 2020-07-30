package Code_99_niuke;

import java.util.List;

public class Code_187 {
    static class Employee{
        public int happy;
        List<Employee> subs;
    }
    static class ReturnData{
        int yesMax;
        int noMax;

        public ReturnData(int yesMax, int noMax) {
            this.yesMax = yesMax;
            this.noMax = noMax;
        }
    }

    public static ReturnData maxHappy(Employee e){
        if(e.subs==null)
            return new ReturnData(e.happy,0);
        int yes=e.happy;
        int no=0;
        for(Employee sub:e.subs){
            ReturnData data=maxHappy(sub);
            yes+=data.noMax;
            no+=Math.max(data.yesMax,data.noMax);
        }
        return new ReturnData(yes,no);
    }
}
