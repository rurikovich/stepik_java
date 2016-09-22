import org.junit.Assert;
import org.junit.Test;
import task2_1.Task2_1__8;

/**
 * Created by rurik on 22.09.2016.
 */
public class Task2_1__8Test extends Assert {
    @Test
    public void testLeapYearCount() {
        assertEquals(0, Task2_1__8.leapYearCount(1));
        assertEquals(1, Task2_1__8.leapYearCount(4));
        assertEquals(24, Task2_1__8.leapYearCount(100));
    }
}
