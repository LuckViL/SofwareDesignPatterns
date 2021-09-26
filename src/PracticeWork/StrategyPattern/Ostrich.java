package PracticeWork.StrategyPattern;

import PracticeWork.StrategyPattern.Behaviors.NoFly;
import PracticeWork.StrategyPattern.Behaviors.NoSwim;

public class Ostrich extends Bird {
    public Ostrich() {
        super(new NoFly(), new NoSwim());
    }

    @Override
    public void display(){
        System.out.println("I'm Ostrich bird!");
    }

    @Override
    public void eat() {
        System.out.println("I eat plants, roots, and seeds.");
    }
}
