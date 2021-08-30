package testjavabasic;

import java.util.*;

class outerclass {
    private int a;
    private static int b;
    private void A(){};
    public static void B(){
        System.out.println("outerclass B()");
    }
    static class innerclass{
        int c = outerclass.b;
        void D(){
            outerclass.B();
        }
    }
}

class outerclassson extends outerclass{
    public void A(){
        System.out.println("son");
    }

//    @Override
    public static void B(){
        System.out.println("son");
    }
}

class outerclass1 {
    private int a;
    private static int b;
    private void A(){
        System.out.println("outerclass1 A()");
    }
    private static void B(){
        System.out.println("outerclass1 B()");
    }
    class innerclass1{
        int c = a;
        int d=b;
        void D(){
            A();
            B();
        }
    }
}

class outerclass2{
    private int a;
    static int b;
    private void D(){
        System.out.println("outerclass2 D()");
    }
    static void E(){
        System.out.println("outerclass2 E()");
    }
    public void function(){
        int i=0;
        int j=0;
        class innerclass{
            int c = a;
            int d=b;
            void V(){
                D();
                E();
                System.out.println(i);
                System.out.println(j);
            }
        }

        new innerclass().V();
    }
}

class test{
    public static void main(String[] args) {
        outerclass.innerclass innerclass = new outerclass.innerclass();
        innerclass.D();
        int i = innerclass.c;
        outerclass1 outerclass1 = new outerclass1();
        outerclass1.innerclass1 innerclass1 = outerclass1.new innerclass1();
        innerclass1.D();
        outerclass2 outerclass2 = new outerclass2();
        outerclass2.function();
        StringTokenizer stringTokenizer  = new StringTokenizer("a\tb\tc\td");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            int in = (int)iterator.next();
            System.out.println(in);
            if(in==2)
                list.add(5);
        }

        outerclassson outerclassson = new outerclassson();
        testjavabasic.outerclassson.B();
    }
}