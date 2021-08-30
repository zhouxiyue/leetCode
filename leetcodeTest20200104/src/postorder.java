import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorder {
    public List<Integer> postorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;
        TreeNode flag = null;
        List<Integer> list = new ArrayList<>();
        while(cur!=null){
            stack.push(cur);
            cur=cur.left;
        }
        while(!stack.isEmpty()){
            cur=stack.pop();
            if(cur.right==null||flag==cur.right){
                list.add(cur.val);
                flag=cur;
            }else{
                stack.push(cur);
                cur=cur.right;
                while(cur!=null){
                    stack.push(cur);
                    cur=cur.left;
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        buildTree buildTree = new buildTree();
        TreeNode root = buildTree.buildTree("1,2,#,#,3,#,4,5,#,#,6,#,#");
        postorder postorder = new postorder();
        postorder.postorder(root);
    }

}
