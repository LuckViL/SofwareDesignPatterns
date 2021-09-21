package PracticeWork.Behaviors;

public class NoFly implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
