import javax.print.DocFlavor;

/**
 * Created by jaygong on 2017/6/7.
 */
class Name{
    private String firstName;
    private String lastName;
    public Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
public class Person {
    private final Name name;

    public Person(Name name) {
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName() {
        return new Name(name.getFirstName(), name.getLastName());
    }

    public static void main(String[] args) {
        Name n = new Name("Wukong", "Sun");
        Person p = new Person(n);
        System.out.println(p.getName().getFirstName());
        n.setFirstName("Bajie");
        System.out.println(p.getName().getFirstName());


    }
}
