/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    Money testObj = new Money();
    @Test
    public void calcPercentTest(){
        double actual = testObj.calcPercent(100.0,20, 1.1);
        assertTrue(672.80 > actual);
    }
}
