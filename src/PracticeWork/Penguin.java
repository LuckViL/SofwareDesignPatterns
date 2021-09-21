package PracticeWork;

import PracticeWork.Behaviors.NoFly;
import PracticeWork.Behaviors.Swim;

public class Penguin extends Bird{
    public Penguin() {
        super(new NoFly(), new Swim());
    }

    @Override
    public void display(){
        System.out.println("I'm Penguin!");
    }

    @Override
    public void eat() {
        System.out.println("I eat krill, squids and small fishes");
    }
}
