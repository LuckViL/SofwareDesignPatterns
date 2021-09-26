package PracticeWork.StrategyPattern;

import PracticeWork.StrategyPattern.Behaviors.Fly;
import PracticeWork.StrategyPattern.Behaviors.Swim;

public class Swan extends Bird {
    public Swan() {
        super(new Fly(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm Swan!");
    }

    @Override
    public void eat() {
        System.out.println("I eat plants and tiny fish, tadpoles, worms, molluscs.");
    }
}
