package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: m_arino
 * Date: 12/01/10
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class TaskController {

    public void process(int Flag) {
        CalcTax myTax;
        myTax = getTaxRulesForCountry(Flag);
        SalesOrder mySO = new SalesOrder();
        mySO.process(myTax);
    }

    private CalcTax getTaxRulesForCountry(int Flag) {

        /*
         * ここで何を使うか指定するかはわかったけど
         * ここが複雑怪奇になってしまうんでないかね？
         */

        if (Flag == 1) {
            return new CanTax();
        } else {
            return new USTax();
        }

    }

}
