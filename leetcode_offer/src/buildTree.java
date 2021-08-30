import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class buildTree {
    public TreeNode buildTree(String[] list){
        Queue<String> queue = new LinkedList<>();
        for(String i:list){
            queue.add(i);
        }
        return help(queue);
    }

    public TreeNode help(Queue<String> queue){
        if(queue.isEmpty())
            return null;
        String re = queue.poll();
        if(re.equals("null"))
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(re));
        root.left = help(queue);
        root.right = help(queue);
        return root;
    }
}
