/**
 * Created by jaygong on 2017/5/26.
 */
public class StaticAccessNonStatic {
    public void info() {
        System.out.println("simple info method");
    }
    public static void main(String[] args)
    {
//        StaticAccessNonStatic temp = new StaticAccessNonStatic();
        //默认构造函数
        new StaticAccessNonStatic().info();
    }
}
