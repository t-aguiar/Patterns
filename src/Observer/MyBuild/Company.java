package Observer.MyBuild;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Taguiar on 1/29/14.
 */
public class Company implements Observer {

    private Observable stockUpdate;

    public Company(Observable observable)
    {
        stockUpdate = observable;
        stockUpdate.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        System.out.print("Company received update: ");
        if(o instanceof Information)
        {
            Information data = (Information) o;

            if(data.sellStocks())
                System.out.println("SELL");
            else
                System.out.println("HOLD");
        }
    }
}
