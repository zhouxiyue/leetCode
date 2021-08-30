class q84 {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0)
            return 0;
        if(heights.length==1)
            return heights[0];
        int max=0;
        for(int i=0;i<heights.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<heights.length;j++){
                min=Math.min(min,heights[j]);
                max=Math.max(max,(j-i+1)*min);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {0,9};
        q84 q84 = new q84();
        q84.largestRectangleArea(num);
    }
}

class q84_1{
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0)
            return 0;
        return dfs(heights,0,heights.length-1);
    }

    public int dfs(int[] heights,int start,int end){
        if(start>end)
            return 0;
        int minindex=start;
        int min=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(min>heights[i]) {
                min = heights[i];
                minindex = i;
            }
        }
        return Math.max((end-start+1)*min,
                Math.max(dfs(heights,start,minindex-1)
                ,dfs(heights,minindex+1,end)));
    }
}
