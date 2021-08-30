public class q65 {
    public int add(int a, int b) {
        while(b!=0){
            int tmp = a^b;
            b=(a&b)<<1;
            a=tmp;
        }
        return a;
    }
}
