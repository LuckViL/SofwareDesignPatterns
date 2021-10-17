package PracticeWork.FactoryMethod2;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders(){
        System.out.println("Added.");
    }

    public void encrypt(){
        System.out.println("Encrypt.");
    }
}
