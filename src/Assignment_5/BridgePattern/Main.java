package Assignment_5.BridgePattern;

public class Main {

    public static void main(String[] args){
        Game computerGame = new ComputerGame();
        Game mobileGame = new MobileGame();

        computerGame.setHeadphone(new SteelSeriesHeadphone());
        computerGame.useHeadphone(computerGame.toString());
        computerGame.setMicrophone(new HyperXMicrophone());
        computerGame.useMicrophone();
        System.out.println();
        mobileGame.setHeadphone(new XiaomiHeadphone());
        mobileGame.useHeadphone(mobileGame.toString());
    }
}
