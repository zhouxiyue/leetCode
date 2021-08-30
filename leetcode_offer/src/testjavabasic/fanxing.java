package testjavabasic;

import java.lang.reflect.Array;
import java.util.*;

class Fruit{
    private void fum(int a,int b){}
    private int fum(int a,String b){return 1;}
}
class Apple extends Fruit{
    public void fun() {
//        super.fum();
    }
}
class Apple1 extends Apple{}
class Apple2 extends Apple{}
class Apple3 extends Apple{}
class orange extends Fruit{}
class peach extends Fruit{}
class banana extends Fruit{}
public class fanxing {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        List<? extends Fruit> list = apples;
        list.add(null);
//        list.add(new Apple());
        Fruit fruit = list.get(0);
        List<? super Apple> list1 = new ArrayList<>();
//        Fruit apple = list1.get(0);
        list1.add(new Apple());
        list1.add(new Apple1());
        ArrayList list2 = new ArrayList();
        Iterator iterator1 = list2.iterator();
        Vector list3 = new Vector();
        Iterator iterator2 = list3.iterator();
        LinkedList list4 = new LinkedList();
        Iterator iterator3 = list2.iterator();
    }
}


