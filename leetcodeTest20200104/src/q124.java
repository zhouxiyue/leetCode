public class q124 {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        help(root);
        return max;
    }

    public int help(TreeNode root){
        if(root==null)
            return 0;
        int left = Math.max(help(root.left),0);
        int right = Math.max(help(root.right),0);
        int sum=root.val+left+right;
        if(sum>max){
            max=sum;
        }
        return root.val+Math.max(left,right);
    }
}
