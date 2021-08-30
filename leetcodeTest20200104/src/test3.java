import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int weight = in.nextInt();
        if(weight==0){
            System.out.println(0);
            return;
        }
        String[] list = s.split(" ");
        double sum=0;
        for(int i=0;i<list.length;i++){
            sum+=Integer.valueOf(list[i]);
        }
        double d = Math.ceil(sum/weight);
        System.out.println((int)d);
    }

}

class c1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] list1 = s1.split(" ");
        String[] list2 = s2.split(" ");
        int[] weight = new int[n];
        int[] value = new int[n];
        for(int i=0;i<n;i++){
            weight[i]=Integer.valueOf(list1[i]);
            value[i]=Integer.valueOf(list2[i]);
        }
        int[][] dp = new int[n+1][v+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<v+1;j++){
                if(weight[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
            }
        }
        System.out.println(dp[n][v]);
    }
}

class c2{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i=0;i<5;i++){
            String s = sc.nextLine();
            String[] list = s.split(" ");
            for(int j=0;j<5;j++){
                matrix[i][j]=Integer.valueOf(list[j]);
            }
        }


    }
}
