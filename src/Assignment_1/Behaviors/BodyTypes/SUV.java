package Assignment_1.Behaviors.BodyTypes;

import Assignment_1.Behaviors.Interfaces.IBodyType;

public class SUV implements IBodyType {
    @Override
    public void bodyType() {
        System.out.println("My car body type is sport-utility vehicle.");
    }
}
