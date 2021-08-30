public class q55_2 {
    boolean re=true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return re;
    }

    public int height(TreeNode root){
        if(root==null)
            return 0;
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        if(Math.abs(leftheight-rightheight)>1)
            re=false;
        return Math.max(leftheight,rightheight)+1;
    }

}
