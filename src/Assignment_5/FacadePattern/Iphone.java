package Assignment_5.FacadePattern;

public class Iphone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("iPhone 13");
    }

    @Override
    public void price() {
        System.out.println("515 000 KZT");
    }
}
