package PracticeWork.BridgePattern;

public class ComputerWindows extends Computer{
    public ComputerWindows() {
        super("Windows 10");
    }

    @Override
    public void usePrinter() {
        System.out.println("Start use printer.");
        printer.print();
    }
}
