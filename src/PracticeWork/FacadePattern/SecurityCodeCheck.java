package PracticeWork.FacadePattern;

public class SecurityCodeCheck {
    private int securityCode = 123;

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public boolean isCodeCorrect(int securityCodeToCheck){
        if(getSecurityCode() == securityCodeToCheck){
            return true;
        } else {
            return false;
        }
    }
}
