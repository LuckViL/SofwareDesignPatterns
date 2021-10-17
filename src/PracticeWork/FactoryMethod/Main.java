package PracticeWork.FactoryMethod;

public class Main {
    public static void main(String[] args){
        IDeveloperFactory factory = new CPPDeveloperFactory();
        IDeveloper developer = factory.createDeveloper();

        developer.writeCode();
    }
}
