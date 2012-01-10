package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: m_arino
 * Date: 12/01/10
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class StrategyMain {
    
    public static void main(String args[]){
        TaskController task = new TaskController();
        task.process();
    }
}
