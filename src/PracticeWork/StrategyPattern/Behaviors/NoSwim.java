package PracticeWork.StrategyPattern.Behaviors;

import PracticeWork.StrategyPattern.Behaviors.ISwimBehavior;

public class NoSwim implements ISwimBehavior {

    @Override
    public void swim() {
        System.out.println("I can't swim :(");
    }
}
