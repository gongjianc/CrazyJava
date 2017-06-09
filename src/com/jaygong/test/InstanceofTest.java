/**
 * Created by jaygong on 2017/6/2.
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Object hello = "hello";
        System.out.println("hello is instance of Object:" + (hello instanceof Object));
        System.out.println("hello is instance of String:" + (hello instanceof String));
        System.out.println("hello is instance of Math:" + (hello instanceof Math));
        System.out.println("hello is instance of Comparable:" + (hello instanceof Comparable));

    }
}
