package Assignment_2;

import java.util.ArrayList;
import java.util.List;

public class WebpageOfCurrency implements IObservable{
    private List<IObserver> clients = new ArrayList<>();
    private double USDPrice;
    private double RUBPrice;
    private double EURPrice;

    @Override
    public void registerUser(IObserver client) {
        this.clients.add(client);
    }

    @Override
    public void deleteUser(IObserver client) {
        this.clients.remove(client);
    }

    @Override
    public void notifyUsers() {
        for (IObserver client: clients){
            client.update(USDPrice, RUBPrice, EURPrice);
        }
    }

    public void setUSDPrice(double USDPrice) {
        this.USDPrice = USDPrice;
        notifyUsers();
    }

    public void setRUBPrice(double RUBPrice) {
        this.RUBPrice = RUBPrice;
        notifyUsers();
    }

    public void setEURPrice(double EURPrice) {
        this.EURPrice = EURPrice;
        notifyUsers();
    }
}
