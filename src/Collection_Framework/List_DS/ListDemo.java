package Collection_Framework.List_DS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    private static Iterator<Integer> valuesIterator;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> valuesIterator = list.iterator();
        while(valuesIterator.hasNext()){

            System.out.println(valuesIterator.next());

        }
        System.out.println("for each loop");
        for(int x : list){
            System.out.println(x);
        }
        System.out.println("for each method");
        list.forEach(  (Integer x)-> System.out.println(x));

    }
}
