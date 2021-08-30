package test;

import java.util.Scanner;

public class q2 {
    public static String[] rrr = new String[4];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs=s.split(" ");

        String re1=help2(strs[0],strs[2]);
        String re2=help2(strs[1],strs[2]);

        String re3=help4(strs[0]);
        String re = re1.equals(re2)?"1":"0";
        re+=" "+re3;
        System.out.print(re);
    }

    public static String help2(String s1,String s2){
        String re="";
        String[] st1=s1.split("\\.");
        String[] st2=s2.split("\\.");
        for(int i=st1.length-1;i>=0;i--){
            String r="";
            int j=0;
            int i1=Integer.valueOf(st1[i]);
            int i2=Integer.valueOf(st2[i]);
            while(i2!=0){
                r+=(i2&i1)!=0?"1":"0";
                j+=((i2&i1)!=0?1:0);
                i2>>>=2;
                i1>>>=2;
            }
            if(j==0){
                rrr[i]="1";
            }
            re+=r+".";
        }
        return re;
    }
    public static String help4(String s1){
        String re="";
        String[] st1=s1.split("\\.");
        for(int i=0;i<st1.length;i++){
            if(rrr[i]!=null&&rrr[i].equals("1")){
                st1[i]="0";
            }
        }
        for(int i=0;i<st1.length;i++){
            re+=st1[i]+".";
        }
        return re.substring(0,re.length()-1);
    }

    public static String help3(String s1,String s2){
        String re="";
        String[] st1=s1.split("\\.");
        String[] st2=s2.split("\\.");
        for(int i=0;i<st1.length;i++){
            if(st2[i].equals("0")){
                st1[i]="0";
            }
        }
        for(int i=0;i<st1.length;i++){
            re+=st1[i]+".";
        }
        return re.substring(0,re.length()-1);
    }


    public static String change(String s){
        String[] st = s.split("\\.");
        String re="";
        for(int i=0;i<st.length;i++) {
            re+= Integer.toBinaryString(Integer.valueOf(st[i]))+" ";
        }
        return re;
    }
    public static int help(String s1,String s2,String s3){
        int i1=Integer.valueOf(s1);
        int i2=Integer.valueOf(s2);
        int i3=Integer.valueOf(s3);
        while(i3!=0){
            if((i3&i1)!=(i3&i2)){
                return 0;
            }
            i3<<=2;
        }
        return 1;
    }
}
