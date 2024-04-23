package Collection_Framework.Set;

import java.util.HashSet;
// it doesn't allow duplicate and uses hashing to store elements means uses hashmap key

public class HashSetImpl {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(30);
        hs.add(30);
        hs.add(1);

        System.out.println(hs.toString());
    }
}
