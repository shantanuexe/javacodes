package Collection_Framework.Queue;

import java.util.ArrayDeque;
// it implements dequeue interface and deque is extending queue interface , it is having extra method
// meaning insertion and deletion can occur from both ends , addFirst ,addLast() similary other opertaions.
// if insertion from last and delete from last then its a stack , it maintains order
// we can use thread safe version of this using ConcurrentLinkedDequqe
public class ArrayDequeImpl {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // we can implement arraydequqe as stack by adding from first and removing from first or adding last removing last

        stack.offerLast(1);
        stack.offerLast(2);
        stack.offerLast(3);

        while (!stack.isEmpty()){
            System.out.println(stack.removeLast());
        }


    }
}
