package Assignment_1;

import Assignment_1.Behaviors.BodyTypes.Convertible;
import Assignment_1.Behaviors.TypeOfuel.Gasoline;
import Assignment_1.Behaviors.TypeOfDrives.RearEngine;
import Assignment_1.Behaviors.NumberOfDoors.TwoDoors;

public class ChevroletCorvette extends Car{

    public ChevroletCorvette() {
        super(new TwoDoors(), new Convertible(), new RearEngine(), new Gasoline());
    }

    @Override
    public void display() {
        System.out.println("I'm Chevrolet Corvette! I was introduced at the GM Motorama in 1953");
    }
}
