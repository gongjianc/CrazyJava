import java.util.Collection;
import java.util.HashSet;

/**
 * Created by jaygong on 2017/6/10.
 */
public class CollectionEach
{
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java EE");
        books.add("Crazy Java");

        books.add("Android");
        books.forEach(obj-> System.out.println("IS " + obj));
    }
}
