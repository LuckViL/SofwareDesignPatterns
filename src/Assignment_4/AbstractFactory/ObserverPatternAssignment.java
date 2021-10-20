package Assignment_4.AbstractFactory;

public class ObserverPatternAssignment implements IAssignment{
    public ObserverPatternAssignment(Importance importance) {
        System.out.println("The level of this assignment is " + importance + "!");
    }

    @Override
    public void getContent() {
        System.out.println("Content: Create your example for observer pattern!");
    }

    @Override
    public void getDeadline() {
        System.out.println("Deadline: 21-10-2021");
    }

    @Override
    public void addToPlan(IPlan plan) {
        System.out.println("Assignment observer pattern is added to " + plan);
    }
}
