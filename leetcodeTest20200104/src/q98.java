import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class q98 {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            if(!stack.isEmpty()){
                TreeNode p = stack.pop();
                list.add(p.val);
                cur=p.right;
            }
        }

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
                return false;
        }
        return true;
    }
}

class q98_1 {
    public boolean isValidBST(TreeNode root) {
        return help(root,Double.MIN_VALUE,Double.MAX_VALUE);
    }
    public boolean help(TreeNode root,double left,double right) {
        if(root==null)
            return true;
        if(root.val<=left||root.val>=right)
            return false;
        return help(root.left,left,root.val)&&help(root.right,root.val,right);
    }
}
