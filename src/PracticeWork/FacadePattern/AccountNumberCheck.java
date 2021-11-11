package PracticeWork.FacadePattern;

public class AccountNumberCheck {
    private int accountNumber = 1234;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean accountActive(int accountNumberToCheck){
        if(getAccountNumber() == accountNumberToCheck){
            return true;
        } else {
            return false;
        }
    }
}
