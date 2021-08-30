public class q28 {
    public boolean isSymmetric(TreeNode root) {
        return help(root,root);
    }

    public boolean help(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null||root2==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return help(root1.left,root2.right)&&help(root1.right,root2.left);
    }
}
