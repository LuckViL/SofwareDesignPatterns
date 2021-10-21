package PracticeWork.BrigePattern;

public class ComputerMac extends Computer{
    public ComputerMac() {
        super("Mac os X");
    }

    @Override
    public void usePrinter() {
        System.out.println("Start use printer.");
        printer.print();
    }
}
