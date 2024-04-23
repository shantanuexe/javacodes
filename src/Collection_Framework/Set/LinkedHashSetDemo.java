package Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    // linked hashset maintains the insertion order & do not allow duplicate
    // hash set follows sorting order &


    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //HashSet<String> lhs = new HashSet<>();

        lhs.add("B");
        lhs.add("A");
        lhs.add("C");
        lhs.add("D");
        lhs.add("C");

        lhs.forEach(System.out::println);

    }
}
