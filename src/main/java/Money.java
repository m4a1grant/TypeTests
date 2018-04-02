/**
 * Class created to demonstrate, why double precision numbers aren't useful in
 * banking operation
 * @author grant_ua
 * @version 0.1
 */
public class Money {

    /**
     *
     * @param start -
     * @param period
     * @param plus
     * @return
     */
    public double calcPercent(double start, int period, double plus){
        double answ = start;
        for (int i = 0; i < period; i++) {
            answ = answ * plus;
            System.out.println(answ);
        }
        return answ;
    }
}
