package PracticeWork.Behaviors;

public class NoSwim implements ISwimBehavior{

    @Override
    public void swim() {
        System.out.println("I can't swim :(");
    }
}
