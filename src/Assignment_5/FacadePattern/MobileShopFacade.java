package Assignment_5.FacadePattern;

public class MobileShopFacade {
    private Iphone iphone;
    private Samsung samsung;

    public MobileShopFacade(){
        iphone = new Iphone();
        samsung = new Samsung();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
}
