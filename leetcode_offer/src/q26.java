public class q26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null)
            return false;
        if(A.val==B.val&&check(A,B)){
            return true;
        }
        return isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public boolean check(TreeNode A,TreeNode B){
        if(B==null)
            return true;
        if(A==null)
            return false;
        if(A.val!=B.val)
            return false;
        return check(A.left,B.left)&&check(A.right,B.right);
    }
}
