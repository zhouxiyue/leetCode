import java.util.ArrayList;
import java.util.List;

class treeNode{
    treeNode left;
    treeNode right;
    int val;
    int count=0;
    public treeNode(int val){
        this.val=val;
    }
}

public class q315 {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] li = new int[nums.length];
        treeNode root=null;
        for(int i=nums.length-1;i>=0;i--){
            root=help(root,nums[i],li,i);
        }
        return list;
    }

    public treeNode help(treeNode root,int val,int[] li,int index){
        if(root==null)
            root = new treeNode(val);
        else if(root.val>=val){
            root.count++;
            root.left = help(root.left,val,li,index);
        }else if(root.val<val){
            li[index]+=root.count+1;
            root.right=help(root.right,val,li,index);
        }
        return root;
    }

    public static void main(String[] args) {
        q315 q315 = new q315();
        q315.countSmaller(new int[]{5,2,6,1});
    }
}
