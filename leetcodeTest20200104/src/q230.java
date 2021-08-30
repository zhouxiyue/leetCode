import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class q230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list.get(k-1);
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

    public int kthSmallest1(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node=root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            if(!stack.isEmpty()){
                TreeNode tmp = stack.pop();
                list.add(tmp.val);
                node=tmp.right;
            }
        }
        return list.get(k-1);
    }
}
