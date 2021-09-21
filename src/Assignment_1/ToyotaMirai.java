package Assignment_1;

import Assignment_1.Behaviors.NumberOfDoors.FourDoors;
import Assignment_1.Behaviors.BodyTypes.Sedan;
import Assignment_1.Behaviors.TypeOfDrives.FrontEngine;
import Assignment_1.Behaviors.TypeOfuel.Hydrogen;

public class ToyotaMirai extends Car{


    public ToyotaMirai() {
        super(new FourDoors(), new Sedan(), new FrontEngine(), new Hydrogen());
    }

    @Override
    public void display() {
        System.out.println("I'm Toyota Mirai! I was unveiled at the November 2014.");
    }

}