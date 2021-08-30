import java.util.HashSet;
import java.util.Set;

public class q202 {
    public boolean isHappy(int n) {
        if(n==0)
            return false;
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            n=help(n);
            if(set.contains(n))
                return false;
            set.add(n);
        }
        return true;
    }

    public int help(int n){
        int sum=0;
        while(n!=0){
            int num=n%10;
            n/=10;
            sum+=num*num;
        }
        return sum;
    }
}

class q202_1{
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow = help(slow);
            fast = help(fast);
            fast = help(fast);
        }while(slow!=fast);
        return slow==1;
    }

    public int help(int n){
        int sum=0;
        while(n!=0){
            int num=n%10;
            n/=10;
            sum+=num*num;
        }
        return sum;
    }
}
