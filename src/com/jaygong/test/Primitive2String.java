/**
 * Created by jaygong on 2017/6/7.
 */
public class Primitive2String {
    public static void main(String[] args) {
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(intStr);
        System.out.println(it2);
        String floatStr = "4.56";
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = new Float(floatStr);
        String ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);


    }
}
