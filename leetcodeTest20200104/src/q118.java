import java.util.ArrayList;
import java.util.List;

public class q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0)
            return result;
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            if(i==0){
                list.add(1);
                result.add(list);
            }
            else if(i==1){
                list.add(1);
                list.add(1);
                result.add(list);
            }
            else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0)
                        list.add(1);
                    else if (j == i)
                        list.add(1);
                    else
                        list.add(result.get(i - 1).get(j - 1) +
                                result.get(i-1).get(j));
                }
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        q118 q118 = new q118();
        q118.generate(5);
    }
}
