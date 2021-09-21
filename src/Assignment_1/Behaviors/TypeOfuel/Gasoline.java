package Assignment_1.Behaviors.TypeOfuel;

import Assignment_1.Behaviors.Interfaces.ITypeOfFuel;

public class Gasoline implements ITypeOfFuel {
    @Override
    public void typeOfFuel() {
        System.out.println("I drive gasoline.");
    }
}
