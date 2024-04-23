package Collection_Framework.FunctionalInterface;

@FunctionalInterface
interface A{

    public void car();
}
public class FI_DEMO1 {
    public static void main(String[] args) {

        A a = ()-> System.out.println("in card");
        a.car();
    }
}
