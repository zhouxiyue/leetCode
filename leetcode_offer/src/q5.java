public class q5 {
    public String replaceSpace(String s) {
        int spacenum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                spacenum++;
            }
        }
        int add = spacenum*2;
        int init = s.length();
        char[] chars = new char[init+add];
        int index=chars.length-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                chars[index]=s.charAt(i);
                index--;
            }else{
                chars[index]='0';
                index--;
                chars[index]='2';
                index--;
                chars[index]='%';
                index--;
            }
        }
        return String.valueOf(chars);
    }
}
