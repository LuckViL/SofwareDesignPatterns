package PracticeWork.FacadePattern;

public class Main {

    public static void main(String[] args){
        BankAccountFacade accessingBank = new BankAccountFacade(1234,123);
        accessingBank.withdrawCash(50.00);
        accessingBank.depositCash(200.00);
    }
}
