package Collection_Framework.List_DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Represents an ordered collection of elements where duplicate elements are allowed.
// Some common implementations include ArrayList, LinkedList, and Vector and Stack
public class ArrayList_DS {

    public static void main(String[] args) {

        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(30);
        al1.add(5);

        ArrayList<Integer> al2= new ArrayList<>();
        al2.add(10);
        al2.add(2);
        //al1.
        System.out.println(al1.lastIndexOf(30));
        al1.retainAll(al2);
        System.out.println(al1);

        ArrayList al = new ArrayList();
        al.add(3);
        al.add("shantanu");
        

//        List<Integer> l1= new ArrayList<>(List.of(10,30,70));
//        al1.addAll(l1);
//
//        for(int i=0; i<al1.size();i++){
//            System.out.println(al1.get(i));
//        }
//
//        al1.forEach(x-> System.out.println(x));

    }

    public void LinkedListDemo(){

        List<Integer> ll1 = new LinkedList<>();


    }
}
