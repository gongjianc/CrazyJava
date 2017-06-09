/**
 * Created by jaygong on 2017/6/8.
 */
public interface Output {
    int MAX_CACHE_LINE = 50;
    void out();
    void getData(String msg);
    default void print(String... msgs)
    {
        for (String msg : msgs){
            System.out.println(msg);
        }
    }
    default void test()
    {
        System.out.println("Output: default test method");
    }
    static String staticTest()
    {
        return "Output: the static method";
    }

}
