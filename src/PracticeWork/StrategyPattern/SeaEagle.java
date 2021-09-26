package PracticeWork.StrategyPattern;

import PracticeWork.StrategyPattern.Behaviors.Fly;
import PracticeWork.StrategyPattern.Behaviors.NoSwim;

public class SeaEagle extends Bird {
    public SeaEagle() {
        super(new Fly(), new NoSwim());
    }

    @Override
    public void display() {
        System.out.println("I'm Sea eagle!");
    }

    @Override
    public void eat() {
        System.out.println("I eat crabs, shellfish, squid and small animals.");
    }
}
