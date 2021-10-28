package PracticeWork.AdapterPattern;

public class Mac implements Computer{
    @Override
    public void insertIntoLightningPort() {
        System.out.println("Lightning connector is plugged into mac machine.");
    }
}
