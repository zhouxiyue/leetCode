public class q66 {
    public int[] plusOne(int[] digits) {
        if(digits.length==0)
            return new int[0];
        if(digits[digits.length-1]<9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        int rest=0;
        for(int i=digits.length-1;i>=0;i--){
            if(i==digits.length-1&&digits[i]+1==10){
                digits[i]=0;
                rest=1;
            }else if(rest==1&&digits[i]+rest==10){
                digits[i]=0;
                rest=1;
            }else if(rest==1&&digits[i]+rest<10){
                digits[i]+=1;
                rest=0;
            }
        }
        if(rest==1&&digits[0]==0){
            int[] re = new int[digits.length+1];
            re[0]=1;
            for(int i=1;i<re.length;i++){
                re[i]=digits[i-1];
            }
            return re;
        }else{
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {2,4,9,3,9};
        q66 q66 = new q66();
        q66.plusOne(digits);
    }

}
