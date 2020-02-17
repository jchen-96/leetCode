package Code_99_JZOFFER;

public class Code_11 {
    public int minArray(int[] numbers) {
        if(numbers==null||numbers.length<=0)
            return 0;
        int l=0;
        int r=numbers.length-1;
        while (l<r){
            int mid=l+(r-l)/2;
            if(numbers[mid]>numbers[r])
                l=mid+1;
            else if (numbers[mid] < numbers[r])
                r=mid;
            else
                r=r-1;
        }
        return numbers[l];
    }
}
