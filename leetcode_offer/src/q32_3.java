import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class q32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> curlevelnode = new Stack<>();
        curlevelnode.add(root);
        int index=0;
        while(!curlevelnode.isEmpty()){
            Stack<TreeNode> nextlevelnode = new Stack<>();
            List<Integer> list = new ArrayList<>();
            if(index%2==0) {
                while(!curlevelnode.isEmpty()){
                    TreeNode tmp = curlevelnode.pop();
                    if (tmp.left != null) {
                        nextlevelnode.add(tmp.left);
                    }
                    if (tmp.right != null) {
                        nextlevelnode.add(tmp.right);
                    }
                    list.add(tmp.val);
                }
            }else if(index%2==1){
                while(!curlevelnode.isEmpty()){
                    TreeNode tmp = curlevelnode.pop();
                    if (tmp.right != null) {
                        nextlevelnode.add(tmp.right);
                    }
                    if (tmp.left != null) {
                        nextlevelnode.add(tmp.left);
                    }
                    list.add(tmp.val);
                }
            }
            index++;
            result.add(list);
            curlevelnode=nextlevelnode;
        }
        return result;
    }
}
