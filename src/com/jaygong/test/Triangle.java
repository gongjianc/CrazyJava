/**
 * Created by jaygong on 2017/6/8.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c)
    {
        super(color);
        setSide(a, b, c);
    }

    public void setSide(double a, double b, double c)
    {
        if (a >= b + c || b >= a + c || c >= a + b){
            System.out.println("Triangle: 两边之和大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
