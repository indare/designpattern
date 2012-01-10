package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: m_arino
 * Date: 12/01/10
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrder {
    
    public void process(CalcTax taxToUse){
        
        int itemSold = 1;
        int qry = 0;
        double price = 0;
        
        double tax = taxToUse.taxAmount(itemSold,qry,price);
        System.out.printf(String.valueOf(tax));
    }
}
