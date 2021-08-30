import java.util.ArrayList;
import java.util.List;

public class q32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        List<TreeNode> curlevelnode = new ArrayList<>();
        curlevelnode.add(root);
        List<Integer> re = new ArrayList<>();
        while(!curlevelnode.isEmpty()){
            List<TreeNode> nextlevelnode = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
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
