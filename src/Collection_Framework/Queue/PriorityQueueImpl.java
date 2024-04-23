package Collection_Framework.Queue;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
//it internally implements using min heap to store in array FIFO
// we can change priority to max or any other by using compartor
//we can use thread safe version of this using PriorirtyBlockingQueue

class MyCom implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2) {
        if(o1<o2)
            return 1;
        if(o1>o2) return -1;
        return 0;
    }
}
public class PriorityQueueImpl {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());
        pq.offer(10);
        pq.offer(5);
        pq.offer(55);
        pq.offer(20);
        pq.offer(3);

        PriorityQueue<Integer> minHpq = new PriorityQueue<>((x1,x2)-> x2-x1);
        minHpq.add(1);
        minHpq.add(8);
        minHpq.offer(3);
        System.out.println(minHpq);

        while (!minHpq.isEmpty()){

            System.out.println(minHpq.remove());
        }


      //  System.out.println(minHpq);
      //  pq.forEach((x)-> System.out.println(x));
    }
}
