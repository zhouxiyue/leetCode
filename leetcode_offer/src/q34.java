import java.util.ArrayList;
import java.util.List;

public class q34 {
    private List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<>();
        if(root==null)
            return result;
        dfs(root,sum,new ArrayList<>());
        return result;
    }

    public void dfs(TreeNode root,int sum,List<Integer> list){
        if(root==null)
            return;
        if(sum==root.val&&root.left==null&&root.right==null){
            list.add(root.val);
            result.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.val);
        dfs(root.left, sum-root.val, list);
        dfs(root.right, sum-root.val, list);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        buildTree buildTree = new buildTree();
        TreeNode root =buildTree.buildTree
                (new String[]{"5","4","11","7","null","null","2",
                        "null","null","null","8","13","null","null","4",
                        "5","null","null","1","null","null"});

        q34 q34 = new q34();
        q34.pathSum(root,22);
    }
}
