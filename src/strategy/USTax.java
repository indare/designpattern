package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: m_arino
 * Date: 12/01/10
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */
public class USTax extends CalcTax {
    public double taxAmount(
                int itemSold,int qty,double price){
        return 2.0;
    }
}
