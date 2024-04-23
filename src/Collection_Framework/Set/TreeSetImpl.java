package Collection_Framework.Set;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class TreeSetImpl {

    // elements are sorted here

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(List.of(10,3,99,4,22));
        //System.out.println(ts.toString());

        Collection<Integer> c = new TreeSet<>(List.of(10,3,99,4,22));
        System.out.println(c.toString());

    }
}
