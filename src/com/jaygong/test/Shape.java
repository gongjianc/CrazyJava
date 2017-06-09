import com.sun.xml.internal.ws.message.saaj.SAAJHeader;
import sun.security.provider.SHA;

/**
 * Created by jaygong on 2017/6/8.
 */
public abstract class Shape {
    {
        System.out.println("Init Block in Shape");
    }
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();
    public Shape(){}
    public Shape(String color)
    {
        System.out.println("Shape Constructor..");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
