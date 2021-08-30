import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class buildTree {
    public TreeNode buildTree(String s){
        List<String> list = new ArrayList<>(Arrays.asList(s.split(",")));
        TreeNode root = help(list);
        return root;
    }

    public TreeNode help(List<String> list){
        if(list.size()==0)
            return null;
        if(list.get(0).equals("#")){
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left=help(list);
        root.right=help(list);
        return root;
    }

    public static void main(String[] args) {
        buildTree buildTree = new buildTree();
        buildTree.buildTree("1,2,#,#,3,#,4,5,#,#,6,#,#");
    }

}
