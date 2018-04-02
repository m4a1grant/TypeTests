/**
 * Class for a task 1
 *
 *
 */


public class ArrayCheck {
//    long maxMemory = Runtime.getRuntime().maxMemory();
//    long totalMemory = Runtime.getRuntime().totalMemory();
//    long freeMemory = Runtime.getRuntime().freeMemory();

    public void intArrayCheck(int leftBorder, int rightBorder){
        int mid = leftBorder + (rightBorder - leftBorder) / 2;
        if(leftBorder != rightBorder){
            if(arrInit(mid)){
                intArrayCheck(leftBorder, mid - 1);
            } else {
                intArrayCheck(mid+1, rightBorder);
            }
        } else System.out.println(rightBorder);
        
    }

    public boolean arrInit(int range){
        try{
            double [] arr = new double[range];
            return false;
        }catch (OutOfMemoryError ooem){
            return true;
        }
    }
}
