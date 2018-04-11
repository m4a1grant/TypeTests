import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ArrayCheckTest {
    ArrayCheck testObj = new ArrayCheck();

    @Test
    public void intArrayCheckTest(){
        System.out.println("Max size for int is ");
        System.out.println(testObj.arrayCheck(0, Integer.MAX_VALUE, CheckFuncProvider::isCreatableInt));
    }

    @Test
    public void shortArrayCheckTest(){
        System.out.println("Max size for short is ");
        System.out.println(testObj.arrayCheck(0, Integer.MAX_VALUE, CheckFuncProvider::isCreatableShort));
    }

    @Test
    public void doubleArrayCheckTest(){
        System.out.println("Max size for double is ");
        System.out.println(testObj.arrayCheck(0, Integer.MAX_VALUE, CheckFuncProvider::isCreatableDouble));
    }

//    @Test
//    public void intWrapperArrayCheckTest(){
//        System.out.println("Max size for Integer is ");
//        System.out.println(testObj.arrayCheck(0, Integer.MAX_VALUE, CheckFuncProvider::isCreatableWrapperInteger));
//    }

//    @Test
//    public void shortWrapperArrayCheckTest(){
//        System.out.println("Max size for Short is ");
//        System.out.println(testObj.arrayCheck(0, Integer.MAX_VALUE, CheckFuncProvider::isCreatableWrapperShort));
//    }

//    @Test
//    public void doubleWrapperArrayCheckTest(){
//        System.out.println("Max size for Double is ");
//        System.out.println(testObj.arrayCheck(0, Integer.MAX_VALUE, CheckFuncProvider::isCreatableWrapperDouble));
//    }
}