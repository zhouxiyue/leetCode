public class q42 {
    public int trap(int[] height) {
        if(height.length==0)
            return 0;
        int max = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
            }
        }

        int sum=0;
        boolean startchange;
        int num;
        for(int i=1;i<=max;i++){
            startchange=false;
            num=0;
            for(int j=0;j<height.length;j++){
                if(height[j]>=i){
                    sum+=num;
                    num=0;
                    startchange=true;
                }
                if(startchange&&height[j]<i){
                    num++;
                }
            }
        }
        return sum;
    }

    public int trap1(int[] height) {
        if(height.length==0)
            return 0;
        int maxleft;
        int maxright;
        int sum=0;
        for(int i=0;i<height.length;i++){
            maxleft=0;
            maxright=0;
            for(int j=i;j>=0;j--){
                maxleft=Math.max(maxleft,height[j]);
            }
            for(int j=i;j<height.length;j++){
                maxright=Math.max(maxright,height[j]);
            }
            sum+=Math.min(maxleft,maxright)-height[i];
        }
        return sum;
    }

    public int trap2(int[] height) {
        if(height.length==0)
            return 0;
        int[] maxl = new int[height.length];
        int[] maxr = new int[height.length];
        int maxleft=height[0];
        int maxright=height[height.length-1];
        maxl[0]=height[0];
        maxr[height.length-1]=height[height.length-1];
        for(int i=0;i<height.length;i++){
            maxl[i]=Math.max(height[i],maxleft);
            maxleft=maxl[i];
        }
        for(int i=height.length-2;i>=0;i--){
            maxr[i]=Math.max(height[i],maxright);
            maxright=maxr[i];
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.min(maxl[i],maxr[i])-height[i];
        }
        return sum;
    }

    public int trap3(int[] height) {
        if(height.length==0)
            return 0;
        int left=0;
        int right = height.length-1;
        int maxl=height[left];
        int maxr=height[right];
        int sum=0;
        while(left<right){
            maxl=Math.max(maxl,height[left]);
            maxr=Math.max(maxr,height[right]);
            if(maxl<maxr){
                sum+=maxl-height[left];
                left++;
            }else{
                sum+=maxr-height[right];
                right--;
            }
        }
        return sum;
    }

    public int trap4(int[] height) {
        if(height.length==0)
            return 0;
        int lmax=0;
        int rmax=height[height.length-1];
        int left=0;
        int right=height.length-1;
        int sum=0;
        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
            if(lmax<rmax){
                sum+=lmax-height[left];
                left++;
            }else{
                sum+=rmax-height[right];
                right--;
            }
        }
        return sum;
    }
}
