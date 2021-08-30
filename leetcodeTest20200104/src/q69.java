public class q69 {
    public int mySqrt(int x) {
        long left = 0;
        long right = x/2+1;
        while(left<right){
            long mid = (left+right+1)/2;
            long square = mid*mid;
            if(square>x){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        return (int)left;
    }

    public int mySqrt1(int x) {
        long res = x;
        while(res*res>x){
            res=(res+x/res)/2;
        }
        return (int)res;
    }

    public int mySqrt2(int x) {
        if(x==1)
            return 1;
        int min=0;
        int max=x;
        while(max-min>1){
            int mid = (max+min)/2;
            if(x/mid>=mid)
                min=mid;
            else
                max=mid;
        }
        return min;
    }
}
