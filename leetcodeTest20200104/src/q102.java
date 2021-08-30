import java.util.ArrayList;
import java.util.List;

public class q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        List<TreeNode> curlevelnode = new ArrayList<>();
        curlevelnode.add(root);
        while(!curlevelnode.isEmpty()){
            List<Integer> list = new ArrayList<>();
            List<TreeNode> nextlevelnode = new ArrayList<>();
            for(int i=0;i<curlevelnode.size();i++){
                TreeNode tmp = curlevelnode.get(i);
                if(tmp.left!=null){
                    nextlevelnode.add(tmp.left);
                }
                if(tmp.right!=null){
                    nextlevelnode.add(tmp.right);
                }
                list.add(tmp.val);
            }
            result.add(list);
            curlevelnode=nextlevelnode;
        }
        return result;
    }
}
