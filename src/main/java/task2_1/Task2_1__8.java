package task2_1;

/**
 * Created by rurik on 22.09.2016.
 */
public class Task2_1__8 {

    public static int leapYearCount(int year) {
        return year/4-(year/100-year/400);
    }

}
