/**
 * Created by jaygong on 2017/6/7.
 */
class PersonOne{
    private String name;
    public PersonOne(String name)
    {
        this.name = name;
    }
}
public class PringObject {
    public static void main(String[] args) {
        PersonOne p = new PersonOne("Sun Wukong");
        System.out.println(p);
    }

}
