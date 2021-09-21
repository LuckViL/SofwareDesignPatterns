package Assignment_1.Behaviors.TypeOfuel;

import Assignment_1.Behaviors.Interfaces.ITypeOfFuel;

public class Hybrid implements ITypeOfFuel {
    @Override
    public void typeOfFuel() {
        System.out.println("I drive a hybrid.");
    }
}
