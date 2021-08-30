import java.util.Arrays;

public class q66 {
    public int[] constructArr(int[] a) {
        if(a.length==0)
            return new int[0];
        int[] num1 = new int[a.length];
        int[] num2 = new int[a.length];
        int[] re = new int[a.length];
        Arrays.fill(re,1);
        int left = a.length-1;
        int t1=1;
        num1[left]=1;
        while(left>=0){
            if(left==a.length-1) {
                left--;
                continue;
            }
            t1*=a[left+1];
            num1[left]=t1;
            left--;
        }

        int right = 0;
        int t2=1;
        num2[right]=1;
        while(right<a.length){
            if(right==0){
                right++;
                continue;
            }
            t2*=a[right-1];
            num2[right]=t2;
            right++;
        }
        for(int i=0;i<num1.length;i++){
            re[i]=num1[i]*num2[i];
        }
        return re;
    }

    public static void main(String[] args) {
        q66 q66 = new q66();
        q66.constructArr(new int[]{1,2,3,4,5});
    }
}
