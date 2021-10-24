package Assignment_5.BridgePattern;

public class MobileGame extends Game{
    @Override
    public String toString() {
        return "mobile game";
    }

    @Override
    public void useMicrophone() {
        System.out.print("Choosing microphone..." + "\nI chose microphone ");
        microphone.getMicrophone();
    }

    @Override
    public void useHeadphone(String game) {
        System.out.print("Choosing headphone..." + "\nI'm playing " + game + " using headphone ");
        headphone.getHeadphone();
    }
}
