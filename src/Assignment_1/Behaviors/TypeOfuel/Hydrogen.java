package Assignment_1.Behaviors.TypeOfuel;

import Assignment_1.Behaviors.Interfaces.ITypeOfFuel;

public class Hydrogen implements ITypeOfFuel {
    @Override
    public void typeOfFuel() {
        System.out.println("I ride hydrogen.");
    }
}
