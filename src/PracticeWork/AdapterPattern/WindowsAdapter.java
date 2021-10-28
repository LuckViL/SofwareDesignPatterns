package PracticeWork.AdapterPattern;

public class WindowsAdapter implements Computer{
    Windows windows;

    public WindowsAdapter(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void insertIntoLightningPort() {
        System.out.println("Adapter converts Lightning signal to USB.");
        windows.insertIntoUSBPort();
    }
}
