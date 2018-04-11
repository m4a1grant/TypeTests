import java.util.ArrayList;
import java.util.List;

/**
 *
 */
interface CheckFunc{
    boolean check(int range);
}

/**
 *
 */
public class CheckFuncProvider{

    /**
     *
     * @param range
     * @return
     */
    static boolean isCreatableInt(int range){
        try{
            int [] arr = new int[range];
            return false;
        }catch (OutOfMemoryError ooem){
            return true;
        }
    }

    /**
     *
     * @param range
     * @return
     */

    static boolean isCreatableShort(int range){
        try{
            short [] arr = new short[range];
            return false;
        }catch (OutOfMemoryError ooem){
            return true;
        }
    }

    /**
     *
     * @param range
     * @return
     */

    static boolean isCreatableDouble(int range){
        try{
            double [] arr = new double[range];
            return false;
        }catch (OutOfMemoryError ooem){
            return true;
        }
    }

//    static boolean isCreatableWrapperInteger(int range){
//        try{
//            //Integer [] arr = new Integer[range];
//            List <Integer> list = new ArrayList<>(range);
//            return false;
//        }catch (OutOfMemoryError ooem){
//            return true;
//        }
//    }
//
//    static boolean isCreatableWrapperDouble(int range){
//        try{
//            Double [] arr = new Double [range];
//            for(int i = 0; i<arr.length; i++){
//                arr[i] = 0.0;
//            }
//            //List<Double> list = new ArrayList<>(range);
//            return false;
//        }catch (OutOfMemoryError ooem){
//            return true;
//        }
//    }
//
//    static boolean isCreatableWrapperShort(int range){
//        try{
//            Short [] arr = new Short [range];
//            return false;
//        }catch (OutOfMemoryError ooem){
//            return true;
//        }
//    }
}