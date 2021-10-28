package PracticeWork.AdapterPattern;

public class Client {
    public void insertLightningConnectorIntoComputer(Computer computer) {
        System.out.println("Client inserts Lightning connector into computer.");
        computer.insertIntoLightningPort();
    }
}
