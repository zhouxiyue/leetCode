import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class q103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> curlevelnode = new Stack<>();
        curlevelnode.add(root);
        int level=0;
        while(!curlevelnode.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> nextlevelnode = new Stack<>();
            if(level%2==0) {
                while (!curlevelnode.isEmpty()) {
                    TreeNode tmp = curlevelnode.pop();
                    if (tmp.left != null) {
                        nextlevelnode.push(tmp.left);
                    }
                    if (tmp.right != null) {
                        nextlevelnode.push(tmp.right);
                    }
                    list.add(tmp.val);
                }
            }else{
                while (!curlevelnode.isEmpty()) {
                    TreeNode tmp = curlevelnode.pop();
                    if (tmp.right != null) {
                        nextlevelnode.push(tmp.right);
                    }
                    if (tmp.left != null) {
                        nextlevelnode.push(tmp.left);
                    }
                    list.add(tmp.val);
                }
            }
            result.add(list);
            curlevelnode=nextlevelnode;
            level++;
        }
        return result;
    }
}
