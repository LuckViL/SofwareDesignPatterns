package Assignment_4.AbstractFactory;

public class EndTermProjectAssignment implements IAssignment{
    public EndTermProjectAssignment(Importance importance) {
        System.out.println("The level of this project is " + importance + "!");
    }

    @Override
    public void getContent() {
        System.out.println("Content: Finish coding all details of your project!");
    }

    @Override
    public void getDeadline() {
        System.out.println("Deadline: 27-10-2021");
    }

    @Override
    public void addToPlan(IPlan plan) {
        System.out.println("EndTerm project is added to " + plan);
    }
}
