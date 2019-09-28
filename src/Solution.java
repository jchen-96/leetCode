import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("test");
        List<List<Integer>> res=new Solution().get(4);

        Set<List<Integer>> set=new HashSet<>();
        for(List<Integer> list:res){
            Collections.sort(list);
            if(list.size()>1)
                set.add(list);
        }
        System.out.println("test");
    }

    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> get(int n){
        get2(n,new ArrayList<>());
        return result;
    }

    private void get2(int num,List<Integer> pro){
        if(num==0) {
            if (!result.contains(pro)) {
                result.add(new ArrayList<>(pro));
                return;
            }
        }
        for (int i = 1; i < num+1; i++) {
            pro.add(i);
            get2(num-i,pro);
            pro.remove(pro.size()-1);
        }
    }

}