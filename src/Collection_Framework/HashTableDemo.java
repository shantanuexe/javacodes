package Collection_Framework;

import java.util.Hashtable;

public class HashTableDemo {
    // it is an old legacy class , it takes input as object key and value, we need to type cast while accessing using enumerator
    // it is having generic version also which implement Map
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"A");
        ht.put(2,"B");
    }
}
