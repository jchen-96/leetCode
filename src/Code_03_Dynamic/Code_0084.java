package Code_03_Dynamic;

public class Code_0084 {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        for(int i=0;i<heights.length;i++){
            int min_height=Integer.MAX_VALUE;
            for(int j=i;j<heights.length;j++){
                min_height=Math.min(min_height,heights[j]);
                area=Math.max(area,min_height*(j-i+1));
            }
        }
        return area;
    }
}
