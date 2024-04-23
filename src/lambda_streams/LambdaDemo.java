package lambda_streams;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

interface Mylambda {

    public void test();

    default void test1() {
        System.out.println("default");
    }
}


public class LambdaDemo {

    public static void main(String[] args) {

        Mylambda ml= () -> {
                System.out.println("inside mylambda");
            };
        ml.test();
        ml.test1();

        List<Integer> arraylist = List.of(1,2,3,4,5);
        arraylist.forEach(a-> System.out.println(a));
//        Collections.sort(arraylist,( a , b)-> {return b-a;});
//        System.out.println(arraylist);

    }

}
