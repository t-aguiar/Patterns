package Observer.MyBuild;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Taguiar on 1/29/14.
 */
public class PrivateInvestor implements Observer {

    private Observable dataSource;

    public PrivateInvestor(Observable observable)
    {
        dataSource = observable;
        dataSource.addObserver(this);
    }

    public void watchNewSource(Observable observable)
    {
        if(dataSource != null)
        {
            dataSource.deleteObserver(this);
        }

        dataSource = observable;
        observable.addObserver(this);
    }

    public void stopSource()
    {
        dataSource.deleteObserver(this);
        dataSource = null;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        //Check that the observable is of the proper type
        if(o instanceof Information)
        {
            Information data = (Information) o;
            System.out.print("Private Investor rcvd update: ");
            if(data.sellStocks())
                System.out.println("SELL");
            else
                System.out.println("BUY");
        }
    }
}
