package PracticeWork;

import PracticeWork.Behaviors.NoFly;
import PracticeWork.Behaviors.Swim;

public class Kiwi extends Bird{
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
