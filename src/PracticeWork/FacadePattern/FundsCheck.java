package PracticeWork.FacadePattern;

public class FundsCheck {
    private double cashInAccount = 100.00;

    public void makeDeposite(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }

    public boolean haveEnoughMoney(double cashToWithdrawal){
        if(cashToWithdrawal > getCashInAccount()){
            System.out.println("Error: You don't have enough money!");
            System.out.println("Current balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete: Current balance is " + getCashInAccount());
            return true;
        }
    }

    public void decreaseCashInAccount(double cashInAccount) {
        this.cashInAccount -= cashInAccount;
    }

    public void increaseCashInAccount(double cashInAccount) {
        this.cashInAccount += cashInAccount;
    }

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void setCashInAccount(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }
}
