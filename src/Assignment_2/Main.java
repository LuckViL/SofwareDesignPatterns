package Assignment_2;

public class Main {
    public static void main(String[] args){
        WebpageOfCurrency xeCom = new WebpageOfCurrency();
        xeCom.setUSDPrice(424.88);
        xeCom.setRUBPrice(5.84);
        xeCom.setEURPrice(496.51);

        Client client1 = new Client("Daryn");

        xeCom.registerUser(client1);

        xeCom.setRUBPrice(5.98);
        xeCom.setRUBPrice(5.86);
    }
}
