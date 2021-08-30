public class q6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int index = 0;
        while (index < s.length()) {
            // "竖下"读取
            for (int i = 0; i < numRows && index < s.length(); i++) {  // 这里加index < s.length() 是防止在做"竖下"操作的时候字符串读完了，下面同理
                sbs[i].append(s.charAt(index));
                index++;
            }
            // "斜上"读取，从下往上读，最后一行和第一行是算在"竖下"读取中的，所以只存中间numRows - 2行
            for (int i = numRows - 2; i > 0 && index < s.length(); i--) {
                sbs[i].append(s.charAt(index));
                index++;
            }
        }
        // 将后面numRows-1行都拼接到第一行
        for (int i = 1; i < numRows; i++) {
            sbs[0].append(sbs[i]);
        }
        return sbs[0].toString();

    }

    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        int num=3;
        q6 q6 = new q6();
        q6.convert(s,num);
    }
}
