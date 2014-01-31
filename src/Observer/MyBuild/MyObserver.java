package Observer.MyBuild;

/**
 * Created by Taguiar on 1/29/14.
 */
public class MyObserver{
    public static void main(String[] args)
    {
        Information info =  new Information();

        Company company = new Company(info);
        PrivateInvestor investor = new PrivateInvestor(info);

        info.setSellStocks(true);
        info.setSellStocks(false);

        investor.stopSource();

        info.setSellStocks(true);
    }
}
