/**
 * Created by jaygong on 2017/5/26.
 */


public class VariableOverrideTest {
    private String name = "Li Gang";
    private static double price = 78.0;

    public static void main(String[] args) {
        int price = 65;
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }
    public void info(){
        //局部变量会覆盖成员变量
        String name = "Sun Wukong";
        System.out.println(name);
        System.out.println(this.name);
    }

}
