package PracticeWork.StrategyPattern;

import PracticeWork.StrategyPattern.Behaviors.NoFly;
import PracticeWork.StrategyPattern.Behaviors.Swim;

public class Kiwi extends Bird {
    public Kiwi() {
        super(new NoFly(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm Kiwi bird!");
    }

    @Override
    public void eat() {
        System.out.println("I eat worms, bugs, beetles, larvae, and other small invertebrates.");
    }
}
