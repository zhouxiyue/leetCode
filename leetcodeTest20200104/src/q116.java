import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class q116 {
    public Node connect(Node root) {
         if(root==null)
             return null;
        List<Node> curlevel = new ArrayList<>();
        curlevel.add(root);
        while(!curlevel.isEmpty()){
            List<Node> nextlevel = new ArrayList<>();
            for(int i=0;i<curlevel.size();i++){
                Node tmp = curlevel.get(i);
                if(tmp.left!=null){
                    nextlevel.add(tmp.left);
                }
                if(tmp.right!=null){
                    nextlevel.add(tmp.right);
                }
            }
            if(nextlevel.size()!=0) {
                Node cur =nextlevel.get(0);
                for(int i=0;i<nextlevel.size();i++){
                    cur.next=nextlevel.get(i);
                    cur=cur.next;
                }
            }
            curlevel=nextlevel;
        }
        return root;
    }
}

class q116_1 {
    public Node connect(Node root) {
        if(root==null||root.left==null)
            return root;
        root.left.next=root.right;
        if(root.next!=null){
            root.right.next=root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
