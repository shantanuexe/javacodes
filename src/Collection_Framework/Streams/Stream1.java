package Collection_Framework.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<>(List.of(20,10,3,55,77));

        Stream<Integer> sorteddata =arraylist.stream().sorted();
        sorteddata.forEach( x-> System.out.println(x));

       List<Integer> arr= arraylist.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(arr);

        int [] abc= new int[10];
        abc[0]=1;
        abc[1]=2;
        Stream<Integer> abcd = Arrays.stream(abc).boxed().sorted((Integer val1,Integer val2)-> val2-val1);


    }
}
