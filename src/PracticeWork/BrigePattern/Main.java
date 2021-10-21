package PracticeWork.BrigePattern;

public class Main {
    public static void main(String[] args){
        Computer pc1 = new ComputerWindows();
        IPrinter hp = new PrinterHP();
        IPrinter canon = new PrinterCanon();

        pc1.setPrinter(hp);
        pc1.usePrinter();

        pc1.setPrinter(canon);
        pc1.usePrinter();
    }
}
