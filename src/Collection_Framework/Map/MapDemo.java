package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    //Map stores data in key value pair , it can store null values , and its not thread safe , for thread sfe use concureent hashmap
    

    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();

        hashmap.put(null,null);
       // hashmap.put(null,"shantanu");
        hashmap.putIfAbsent(3,"sunny");
        Integer a=4;
        int b=a;
        String bs=hashmap.remove(4);
        System.out.println(bs);
        System.out.println(b);
        hashmap.put(null,"sunny");
        System.out.println(hashmap);

        for(Map.Entry<Integer,String> entry : hashmap.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key "+key+" value"+value);
        }


    }

}
