/**
 * Created by jaygong on 2017/6/2.
 * 初始化块
 */
public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}

class Root{
    static {
        System.out.println("Root: static init block");
    }
    {
        System.out.println("Root: normal init block");
    }
    public Root(){
        System.out.println("Root: Constructor without parameters");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid: static init block");
    }
    {
        System.out.println("Mid: normal init block");
    }
    public Mid()
    {
        System.out.println("Mid: Constructor without parameters");
    }
    public Mid(String msg)
    {
        this();
        System.out.println("Mid: Constructor with parameters" + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf: static init block");
    }
    {
        System.out.println("Leaf: normal init block");
    }
    public Leaf ()
    {
        super("Thinking in Java");
        System.out.println("Leaf: Constructor");
    }
}
