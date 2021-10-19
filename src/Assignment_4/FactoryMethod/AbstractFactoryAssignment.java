package Assignment_4.FactoryMethod;

public class AbstractFactoryAssignment implements Assignment {
    @Override
    public void getContent() {
        System.out.println("Create your example for abstract factory!");
    }

    @Override
    public void getDeadline() {
        System.out.println("Deadline: 21-10-2021");
    }
}
