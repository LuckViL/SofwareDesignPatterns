package Assignment_2;

public class Client implements IObserver{
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(double USD, double RUB, double EUR) {
        System.out.println("Dear " + this.name + ", we have changes in currencies: \n1 USD: " + USD + " KZT\n1 RUB: " + RUB + " KZT\n1 EUR: " + EUR +" KZT\n");
    }
}
