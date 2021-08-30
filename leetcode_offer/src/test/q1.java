package test;

import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m1=sc.next();
        int n=Integer.valueOf(m1);
        if(n==0) {
            System.out.println(0);
            return;
        }
        int max=0;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(sc.nextLine());
        }
        list.remove("");
        int[][] re = new int[n][list.get(0).length()];
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            for(int j=0;j<s.length();j++){
                re[i][j]=s.charAt(j)-'0';
            }
        }
        int m=list.get(0).length();
        int[][] dp = new int[n][m];

        for(int i=0;i<n;i++){
            dp[i][0]=re[i][0];
            max=Math.max(max,dp[i][0]);
        }
        for(int i=0;i<m;i++){
            dp[0][i]=re[0][i];
            max=Math.max(max,dp[0][i]);
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<list.get(0).length();j++){
                if(re[i][j]==1) {
                    dp[i][j] = re[i][j] == 1 ? Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1 : 0;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        System.out.println(max*max);
    }
}
