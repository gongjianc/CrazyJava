/**
 * Created by jaygong on 2017/6/10.
 */
public class FirstThread extends Thread{
    private int i;
    public void run()
    {
        for (; i < 100; i++){
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName());
            if (i == 20) {
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }

}
