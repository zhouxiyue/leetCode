public class q208 {

}
class TrieNode{
    private TrieNode[] links;
    private final int R=26;
    boolean isEnd = false;
    public TrieNode(){
        links = new TrieNode[R];
    }

    public boolean containsKey(char c){
        return links[c-'a']!=null;
    }

    public TrieNode get(char c){
        return links[c-'a'];
    }

    public void put(char c,TrieNode node){
        links[c-'a']=node;
    }

    public void setEnd(){
        isEnd=true;
    }

    public boolean isEnd(){
        return isEnd;
    }

}

class Trie {

    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(char c:word.toCharArray()){
            if(!node.containsKey(c)){
                node.put(c,new TrieNode());
            }
            node = node.get(c);
        }
        node.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(char c:word.toCharArray()){
            if(node.containsKey(c)){
                node=node.get(c);
            }else{
                return false;
            }
        }
        if(node.isEnd())
            return true;
        else
            return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c:prefix.toCharArray()){
            if(node.containsKey(c)){
                node=node.get(c);
            }else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
