class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class q7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode help(int[] preorder,int pleft,int pright,int[] inorder,int ileft,int iright){
        if(pleft>pright||ileft>iright)
            return null;
        int rootval = preorder[pleft];
        int index=ileft;
        for(int i=ileft;i<=iright;i++){
            if(rootval==inorder[i])
                index=i;
        }
        TreeNode root = new TreeNode(rootval);
        root.left=help(preorder,pleft+1,pleft+(index-ileft),inorder,ileft,index-1);
        root.right=help(preorder,pleft+(index-ileft)+1,pright,inorder,index+1,iright);
        return root;
    }
}
