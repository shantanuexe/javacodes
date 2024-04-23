package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparatorDemo {
    public static void main(String[] args) {

        int []a = {300,50,10,30,40};

        Integer []b = {500,10,30,40};

        Arrays.sort(a);
        for(int x : a){
            System.out.println(x);
        }

    }
}
