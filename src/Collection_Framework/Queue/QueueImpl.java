package Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
/*Represents a collection used to hold multiple elements prior to processing. Some common implementations include LinkedList and PriorityQueue.

*/
// diff in linkedlist is hetro & queue is only homogenus
//FIFO
public class QueueImpl {

    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.offerFirst(40);
        q1.offerFirst(30);
        q1.offerFirst(20);
        q1.offerFirst(10);

        q1.forEach(x -> System.out.println(x));

    }
}
