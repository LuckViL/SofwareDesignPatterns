package PracticeWork.StrategyPattern.Behaviors;

public class Swim implements ISwimBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
