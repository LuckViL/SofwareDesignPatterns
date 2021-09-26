package PracticeWork.StrategyPattern;

import PracticeWork.StrategyPattern.Behaviors.IFlyBehavior;
import PracticeWork.StrategyPattern.Behaviors.ISwimBehavior;

public abstract class Bird {
    private IFlyBehavior flyBehavior;
    private ISwimBehavior swimBehavior;

    public Bird(IFlyBehavior flyBehavior, ISwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    public abstract void display();

    public abstract void eat();

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performSwim(){
        this.swimBehavior.swim();
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public ISwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(ISwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}
