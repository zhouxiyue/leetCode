class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val,Node1 _left,Node1 _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class q36$$$ {
    Node1 head;
    Node1 pre;
    Node1 tail;
    public Node1 treeToDoublyList(Node1 root) {
        if(root==null)
            return null;
        pre=null;
        help(root);
        tail.right=head;
        head.left=tail;
        return head;
    }

    public void help(Node1 root){
        if(root==null)
            return;
        help(root.left);
        if(pre==null){
            head=root;
        }else{
            pre.right=root;
        }
        root.left=pre;
        pre=root;
        tail=root;
        help(root.right);
    }
}
