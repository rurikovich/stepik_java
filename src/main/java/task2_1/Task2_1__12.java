package task2_1;

/**
 * Created by rurik on 22.09.2016.
 */
public class Task2_1__12 {

    public static void main(String[] args) {
        System.out.println('A' + "12");
        System.out.println('A' + '1' + "2");
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println("A" + 12);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.00000001;
    }

}
