public class q64 {
    public int sumNums(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return n+sumNums(n-1);
    }
}
