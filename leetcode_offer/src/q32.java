import java.util.ArrayList;
import java.util.List;

public class q32 {
    public int[] levelOrder(TreeNode root) {
        if(root==null)
            return new int[0];
        List<TreeNode> curlevelnode = new ArrayList<>();
        curlevelnode.add(root);
        List<Integer> re = new ArrayList<>();
        while(!curlevelnode.isEmpty()){
            List<TreeNode> nextlevelnode = new ArrayList<>();
            for(int i=0;i<curlevelnode.size();i++){
                TreeNode tmp = curlevelnode.get(i);
                if(tmp.left!=null){
                    nextlevelnode.add(tmp.left);
                }
                if(tmp.right!=null){
                    nextlevelnode.add(tmp.right);
                }
                re.add(tmp.val);
            }
            curlevelnode=nextlevelnode;
        }
        int[] result = new int[re.size()];
        for(int i=0;i<re.size();i++){
            result[i]=re.get(i);
        }
        return result;
    }
}
