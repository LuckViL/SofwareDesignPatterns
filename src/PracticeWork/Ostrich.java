package PracticeWork;

import PracticeWork.Behaviors.NoFly;
import PracticeWork.Behaviors.NoSwim;

public class Ostrich extends Bird{
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
