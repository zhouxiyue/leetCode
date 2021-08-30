package testjavabasic;

import javax.management.Query;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

interface in{
    public void fun1(String s);
    default void fun2(){
        System.out.println("hello");
    }
}

class impin implements in{
    @Override
    public void fun1(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        impin impin = new impin();
        impin.fun2();
    }
}

class test1{
    public void fun(int a,int b){
        System.out.println(a+b);
    }

    public void f1(int a,String b){

    }

    public void f1(String b,int a){

    }
}

class test2{
    public test2() {

    }

    private int A=1;
    private int B=1;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public void fun1(){
        System.out.println(A+B);
    }
}

public class stringcode {
    public static void main(String[] args) {
        try {
            Object object = Class.forName("testjavabasic.test2").getConstructor().newInstance();
            Field[] field = Class.forName("testjavabasic.test2").getDeclaredFields();
//            Object object = Class.forName("testjavabasic.test2").newInstance();
            for(Field f:field) {
                f.setAccessible(true);
            }
            for(Field f:field){
                f.set(object,2);
                System.out.println(f.get(object));
            }


            Method method = Class.forName("testjavabasic.test2").getMethod("setA",int.class);
            Method method1 = Class.forName("testjavabasic.test2").getMethod("fun1");
            method.invoke(object,0);
            method1.invoke(object);

        } catch (Exception e) {
            e.printStackTrace();
        }
        int a=1;
        int b=2;
        in in = (s)-> System.out.println(s+" hello");
        in.fun1("test");

        new Thread(()->{
            System.out.println("hello");
        },"t1").start();

        Map<Integer,Integer> map = new LinkedHashMap<>();
        Query query = new Query();
        String s = "abcdefg";
        try {
            s = new String(s.getBytes("ISO-8859-1"),"utf-8");
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
