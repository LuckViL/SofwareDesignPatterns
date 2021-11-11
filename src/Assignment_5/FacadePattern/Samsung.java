package Assignment_5.FacadePattern;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Samsung A50");
    }

    @Override
    public void price() {
        System.out.println("100 000 KZT");
    }
}
