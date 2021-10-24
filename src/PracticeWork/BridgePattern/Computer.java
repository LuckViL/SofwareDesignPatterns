package PracticeWork.BridgePattern;

public abstract class Computer {
    protected IPrinter printer;
    protected String os;

    public Computer(String os) {
        this.os = os;
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    public abstract void usePrinter();
}
