package Assignment_1.Behaviors.TypeOfuel;

import Assignment_1.Behaviors.Interfaces.ITypeOfFuel;

public class Diesel implements ITypeOfFuel {
    @Override
    public void typeOfFuel() {
        System.out.println("I drive diesel.");
    }
}
