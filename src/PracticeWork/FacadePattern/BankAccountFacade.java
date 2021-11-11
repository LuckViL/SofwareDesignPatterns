package PracticeWork.FacadePattern;

public class BankAccountFacade {
    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;
    WelcomeBankOperator welcomeBankOperator;

    private int accountNumber;
    private int securityCode;

    public void withdrawCash(double cashToGet){
        if(accountNumberCheck.accountActive(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode()) && fundsCheck.haveEnoughMoney(cashToGet)){
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit){
        if(accountNumberCheck.accountActive(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode())){
            fundsCheck.makeDeposite(cashToDeposit);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        welcomeBankOperator = new WelcomeBankOperator();
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}
