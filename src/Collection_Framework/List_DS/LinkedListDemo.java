package Collection_Framework.List_DS;

import java.util.LinkedList;

// here shifting of elements are not required
//easy to insert and delete
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll1= new LinkedList<>();
        ll1.add("shantanu");
        ll1.add("shivam");
        ll1.add("shubham");
       String res = ll1.pollFirst();
        // pollfirst retuns the first element and removes it
        String res1=ll1.poll();
        LinkedList<String> ll3= new LinkedList<>();
        ll3.poll();
        //if list is empty it throws no such elements
        System.out.println(res1);
        System.out.println(ll1);

        LinkedList ll2 = new LinkedList();
        ll2.add("shantanu");
        ll2.add(10);
       // System.out.println(ll2);


    }
}
