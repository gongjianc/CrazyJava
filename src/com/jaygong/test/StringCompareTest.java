/**
 * Created by jaygong on 2017/6/7.
 */
public class StringCompareTest {

    public static void main(String[] args) {
        String s1 = "Crazy Java Lecture";
        String s2 = "Crazy ";
        String s3 = "Java Lecture";
        String s4 = "Crazy " + "Java Lecture";
        String s5 = "Crazy " + "Java " + "Lecture";
        String s6 = s2 + s3;
        String s7 = new String("Crazy Java Lecture");
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
    }
}
