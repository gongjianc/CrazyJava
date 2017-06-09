import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jaygong on 2017/6/1.
 */
class BaseClass{
    public int book = 6;
    public void base(){
        System.out.println("Father method");
    }
    public void test(){
        System.out.println("Father override method");
    }
}
public class SubClass extends BaseClass {
    public String book = "Java EE Book";

    public void test() {
        System.out.println("Sun override method");
    }

    public void sub(){
        System.out.println("Sun method");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        BaseClass bc = new BaseClass();
        bc.base();
        bc.test();

        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        BaseClass ploymophicBc = new SubClass();
        //对象的实例变量不具有多态性，所以这里输出的为base中book变量
        System.out.println(ploymophicBc.book);
        ploymophicBc.base();
        ploymophicBc.test();
//        ploymophicBc.

        System.out.println("Reflect Mode ------------ ");

        Class clazz = ploymophicBc.getClass();
        System.out.println("ploymophicBc's type is " + clazz);
        try {
            System.out.println("ploymophicBc book is " + clazz.getField("book"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        Method mtd = null;
        try {
            mtd = clazz.getMethod("test");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        mtd.invoke(ploymophicBc);


        try {
            Method mtdSub = clazz.getMethod("sub");
            mtdSub.invoke(ploymophicBc);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}


