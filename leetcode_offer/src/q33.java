public class q33 {
    public boolean verifyPostorder(int[] postorder) {
        return help(postorder,0,postorder.length-1);
    }

    public boolean help(int[] postorder,int left,int right){
        if(left>=right)
            return true;
        int rootval = postorder[right];
        int in=right-1;
        while(in>=left&&postorder[in]>rootval){
            in--;
        }
        for(int i=in;i>=left;i--){
            if(postorder[i]>rootval)
                return false;
        }
        return help(postorder,left,in)&&help(postorder,in+1,right-1);
    }

    public static void main(String[] args) {
        q33 q33 = new q33();
        q33.verifyPostorder(new int[]{4, 8, 6, 12, 16, 14, 10});
    }
}
