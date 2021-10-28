package PracticeWork.AdapterPattern;

public class Main {

    public static void main(String[] args){
        Client client = new Client();
        Computer mac = new Mac();

        client.insertLightningConnectorIntoComputer(mac);

        Windows windows = new Windows();
        WindowsAdapter adapter = new WindowsAdapter(windows);

        client.insertLightningConnectorIntoComputer(adapter);
    }
}
