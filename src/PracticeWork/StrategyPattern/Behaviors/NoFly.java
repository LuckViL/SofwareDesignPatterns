package PracticeWork.StrategyPattern.Behaviors;

import PracticeWork.StrategyPattern.Behaviors.IFlyBehavior;

public class NoFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
