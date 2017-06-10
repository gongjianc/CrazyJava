import java.util.ArrayList;

/**
 * Created by jaygong on 2017/6/10.
 */
public class RealTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("pear");
        al.forEach(obj-> System.out.println("Is " + obj));

    }
}
