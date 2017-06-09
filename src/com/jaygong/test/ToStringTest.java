/**
 * Created by jaygong on 2017/6/7.
 */

class Apple{
    private String color;
    private double weight;
    public Apple()
    {}
    public Apple(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString()
    {
        return "An apple-- color: " + color + ", weight: " + weight;
    }
}
public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("red", 5.68);
        System.out.println(a);
    }
}
