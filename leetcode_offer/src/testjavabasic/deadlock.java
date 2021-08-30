package testjavabasic;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class deadlock {
    public String A="A";
    public String B="B";
    public void test(){
        new Thread(()->{
            synchronized (A){
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        },"t1").start();

        new Thread(()->{
            synchronized (B){
                synchronized (A){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        },"t2").start();
    }

    public static void main(String[] args) {
        deadlock deadlock = new deadlock();
        deadlock.test();
    }
}
