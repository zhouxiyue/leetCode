public class q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length!=inorder.length)
            return null;
        return help(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1);
    }

    public TreeNode help(int[] preorder,int preleft,int preright,
                         int[] inorder,int inleft,int inright){
        if(inleft>inright)
            return null;
        int rootval = preorder[preleft];
        int mid = preleft;
        for(int i=inleft;i<=inright;i++){
            if(inorder[i]==rootval){
                mid=i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootval);
        root.left= help(preorder,preleft+1,preleft+(mid-inleft),inorder,inleft,mid-1);
        root.right = help(preorder,preleft+(mid-inleft)+1,preright,inorder,mid+1,inright);
        return root;
    }
}
