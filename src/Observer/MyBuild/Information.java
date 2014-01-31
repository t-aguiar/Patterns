package Observer.MyBuild;

import java.util.Observable;

/**
 * Created by Taguiar on 1/29/14.
 */
public class Information extends Observable
{
    private boolean sellStocks;

    public boolean sellStocks() {
        return sellStocks;
    }

    public void setSellStocks(boolean sellStocks) {
        this.sellStocks = sellStocks;

        this.setChanged();
        notifyObservers(); //push method
    }
}
