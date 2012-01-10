package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: m_arino
 * Date: 12/01/10
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public abstract class CalcTax {
    abstract public double taxAmount(
                int itemSold,int qty,double price);
}
