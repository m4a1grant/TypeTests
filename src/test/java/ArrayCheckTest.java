import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCheckTest {
    ArrayCheck testObj = new ArrayCheck();
    @Test
    public void intArrayCheckTest(){
        testObj.intArrayCheck(0, Integer.MAX_VALUE);
    }
}