import java.util.ArrayList;
import java.util.List;

public class q17 {
    public int[] printNumbers(int n) {
        int num=1;
        int x=10;
        while(n!=0){
            if(n%2!=0){
                num*=x;
            }
            n>>=1;
            x=x*x;
        }
        int[] result = new int[num-1];
        for(int i=0;i<num-1;i++){
            result[i]=i+1;
        }
        return result;
    }

}
