import java.util.*;

public class q54 {
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            if(!stack.isEmpty()){
                TreeNode n = stack.pop();
                list.add(n.val);
                node=n.right;
            }
        }
        Collections.reverse(list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        buildTree buildTree = new buildTree();
        TreeNode root = buildTree.buildTree(new String[]{"3","1","null","2","null",
        "null","4","null","null"});
        q54 q54 = new q54();
        q54.kthLargest(root,1);
    }
}
