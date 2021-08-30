public class q60 {
    private int[] re;
    private int total=0;
    public double[] twoSum(int n) {
        double[] result = new double[5*n+1];
        re = new int[5*n+1];
        int index=0;
        backtrack(n,0,0);
        for(int i=0;i<re.length;i++){
            if(re[i]!=0){
                result[index]=(double)re[i]/total;
                index++;
            }
        }
        return result;
    }
    private void backtrack(int n,int cnt,int sum){
        if(cnt==n){
            re[sum-cnt]+=1;
            total+=1;
            return;
        }
        for(int i=1;i<=6;i++){
            sum+=i;
            cnt+=1;
            backtrack(n,cnt,sum);
            sum-=i;
            cnt-=1;
        }
    }

    public static void main(String[] args) {
        q60 q60 = new q60();
        q60.twoSum(1);
    }
}
