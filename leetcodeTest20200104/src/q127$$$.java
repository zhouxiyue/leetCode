import javafx.util.Pair;

import java.util.*;

public class q127$$$ {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
            return 0;
        int len = beginWord.length();
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<wordList.size();i++){
            for(int j=0;j<len;j++){
                String tmp = wordList.get(i).substring(0,j)+"*"
                        +wordList.get(i).substring(j+1,len);
                if(map.isEmpty()||!map.containsKey(tmp)){
                    List<String> list = new ArrayList<>();
                    list.add(wordList.get(i));
                    map.put(tmp,list);
                }else{
                    List<String> list = map.get(tmp);
                    list.add(wordList.get(i));
                    map.put(tmp,list);
                }
            }
        }
        Queue<Pair<String,Integer>> queue = new LinkedList<Pair<String,Integer>>();
        queue.add(new Pair(beginWord,1));
        Map<String,Boolean> visited = new HashMap<>();
        visited.put(beginWord,true);
        while(!queue.isEmpty()){
            Pair<String,Integer> pair = queue.poll();
            String curword = pair.getKey();
            Integer level = pair.getValue();
            for(int i=0;i<len;i++){
                String tmp = curword.substring(0,i)+"*"
                        +curword.substring(i+1,len);
                if(map.containsKey(tmp)){
                    List<String> list = map.get(tmp);
                    for(String s:list){
                        if(s.equals(endWord)){
                            return level+1;
                        }
                        if(!visited.containsKey(s)){
                            visited.put(s,true);
                            queue.add(new Pair(s,level+1));
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String b="hit";
        String e="cog";
        List<String> list = Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"});
        q127$$$ q127 = new q127$$$();
        q127.ladderLength(b,e,list);
    }
}
