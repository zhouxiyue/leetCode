import java.util.LinkedList;
import java.util.Queue;

public class q37 {
    String s1;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        s1="";
        help(root);
        return s1;
    }

    public void help(TreeNode root){
        if(root==null) {
            s1 += "#,";
            return;
        }
        s1+=root.val+",";
        help(root.left);
        help(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        Queue<String> queue = new LinkedList<>();
        for(String s1:s){
            queue.add(s1);
        }
        return help2(queue);
    }

    public TreeNode help2(Queue<String> queue){
        if(queue.isEmpty())
            return null;
        String re = queue.poll();
        if(re.equals("#")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(re));
        root.left=help2(queue);
        root.right=help2(queue);
        return root;
    }
}
