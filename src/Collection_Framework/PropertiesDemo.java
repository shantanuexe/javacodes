package Collection_Framework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    // it is a type of Hashtable only but it takes key value as String only  it is useful in Storing & accessing properties
    public static void main(String[] args) throws IOException {

        Properties p = new Properties();
        p.put("Display","14inch");
        p.put("Processor","i7");
        p.put("RAM","8gb");

        System.out.println(p);

        p.store(new FileOutputStream("C:/Users/shantanu/Downloads/mydata.txt"),"Laptop");
    }
}
