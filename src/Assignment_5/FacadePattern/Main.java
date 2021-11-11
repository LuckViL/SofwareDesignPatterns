package Assignment_5.FacadePattern;

public class Main {
    public static void main(String[] args) {
        MobileShopFacade mobileShop = new MobileShopFacade();
        mobileShop.iphoneSale();
        mobileShop.samsungSale();
    }
}
