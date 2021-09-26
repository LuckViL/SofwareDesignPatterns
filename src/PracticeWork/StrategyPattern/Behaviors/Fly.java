package PracticeWork.StrategyPattern.Behaviors;

import PracticeWork.StrategyPattern.Behaviors.IFlyBehavior;

public class Fly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
