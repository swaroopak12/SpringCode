package com.mycode;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;
 
public class JavaForEachExample {
 
    public static void main(String[] args) {
         
        //creating a simple Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);
         
        //iterating through the Collection using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }
         
        // forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
 
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }
 
        });
         
        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
         
    }
 
}
 
//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{
 
    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}