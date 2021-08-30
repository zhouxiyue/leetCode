import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class q94 {
    List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        return list;
    }

    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}

class q94_1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur=root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            if(!stack.isEmpty()){
                TreeNode tmp = stack.pop();
                list.add(tmp.val);
                cur=tmp.right;
            }
        }
        return list;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.add(cur);
                cur=cur.left;
            }
            if(!stack.isEmpty()){
                TreeNode tmp=stack.pop();
                list.add(tmp.val);
                cur=tmp.right;
            }
        }
        return list;
    }
}