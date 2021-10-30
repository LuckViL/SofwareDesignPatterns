package PracticeWork.AdapterPattern;

public class Main {

    public static void main(String[] args){
        Client client = new Client();
        Computer mac = new Mac();

        client.insertLightningConnectorIntoComputer(mac);
        System.out.println("------------------------------------");

        Windows windows = new Windows();
        WindowsAdapter adapter = new WindowsAdapter(windows);

        client.insertLightningConnectorIntoComputer(adapter);

        System.out.println("------------------------------------");

        Computer mac1 = new WindowsAdapter(new Windows());
        mac1.insertIntoLightningPort();
    }
}
