public class q208_1 {

}

class TrieNode1{
    TrieNode1[] links;
    int R=26;
    boolean isEnd=false;
    public TrieNode1(){
        links = new TrieNode1[R];
    }

    boolean containsKey(char c){
        return links[c-'a']!=null;
    }

    TrieNode1 get(char c){
        return links[c-'a'];
    }

    void put(char c,TrieNode1 node){
        links[c-'a']=node;
    }

    public void setEnd(){
        isEnd=true;
    }
    public boolean isEnd(){
        return isEnd;
    }



    public static void main(String[] args) {
        TrieNode1 TrieNode1 = new TrieNode1();
        System.out.println();
    }
}

class Trie1 {
    TrieNode1 root;
    public Trie1(){
        root = new TrieNode1();
    }

    public void insert(String word){
        TrieNode1 node = root;
        for(char c:word.toCharArray()){
            if(!node.containsKey(c)){
                node.put(c,new TrieNode1());
            }
            node=node.get(c);
        }
        node.setEnd();
    }

    public boolean search(String word){
        TrieNode1 node = root;
        for(char c:word.toCharArray()){
            if(node.containsKey(c))
                node=node.get(c);
            else
                return false;
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode1 node = root;
        for(char c:prefix.toCharArray()){
            if(node.containsKey(c))
                node=node.get(c);
            else
                return false;
        }
        return true;
    }
}