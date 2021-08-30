import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "";
        return preorder(root,"");
    }

    public String preorder(TreeNode root,String s){
        if(root==null){
            s+="null,";
            return s;
        }else {
            s += root.val + ",";
            s = preorder(root.left, s);
            s = preorder(root.right, s);
        }
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))
            return null;
        List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        return help(list);
    }

    public TreeNode help(List<String> list){
        if(list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = help(list);
        root.right = help(list);
        return root;
    }

    public static void main(String[] args) {
        q297 q297 = new q297();
        q297.deserialize("1,2,3,null,null,4,5");
    }
}
