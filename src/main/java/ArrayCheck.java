/**
 * The {@code ArrayCheck} class
 */


public class ArrayCheck {

    /**
     *
     * @param leftBorder
     * @param rightBorder
     * @param func
     * @return
     */

    public int arrayCheck(int leftBorder, int rightBorder, CheckFunc func){
        int mid = leftBorder + (rightBorder - leftBorder) / 2;
        int answ = 0;
        if(leftBorder != rightBorder){
            if(func.check(mid)){
                answ = arrayCheck(leftBorder, mid - 1, func);
            } else {
                answ = arrayCheck(mid+1, rightBorder, func);
            }
        } else answ = rightBorder;
        return answ;
    }



}