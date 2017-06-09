/**
 * Created by jaygong on 2017/6/8.
 */
interface Eatable {
    void taste();
}

interface Flyable{
    void fly(String weather);
}
interface Addable{
    int add(int a, int b);
}
public class LambdaQs {
    public void eat(Eatable e)
    {
        System.out.println(e);
        e.taste();
    }
    public void drive(Flyable f)
    {
        System.out.println("I'm driving " + f);
        f.fly("A great day with great sunshine");
    }
    public void test(Addable add)
    {
        System.out.println("5 Plus 3 is :" + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        lq.eat(()-> System.out.println("The apple taste good"));
        lq.drive(weather ->
        {
            System.out.println("The weather is " + weather);
            System.out.println("everything is good");
        });
    }


}
