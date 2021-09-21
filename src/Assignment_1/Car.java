package Assignment_1;

import Assignment_1.Behaviors.Interfaces.INumberOfDoors;
import Assignment_1.Behaviors.Interfaces.IBodyType;
import Assignment_1.Behaviors.Interfaces.ITypeOfDrives;
import Assignment_1.Behaviors.Interfaces.ITypeOfFuel;

public abstract class Car {
    private INumberOfDoors numberOfDoors;
    private IBodyType bodyType;
    private ITypeOfDrives typeOfDrives;
    private ITypeOfFuel typeOfFuel;

    public Car(INumberOfDoors numberOfDoors, IBodyType bodyType, ITypeOfDrives typeOfDrives, ITypeOfFuel typeOfFuel) {
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
        this.typeOfDrives = typeOfDrives;
        this.typeOfFuel = typeOfFuel;
    }

    public abstract void display();

    public void aboutNumberOfDoors(){
        this.numberOfDoors.numberOfDoors();
    }

    public void aboutBodyType(){
        this.bodyType.bodyType();
    }

    public void aboutTypeOfDrives(){
        this.typeOfDrives.typeOfDrives();
    }

    public void aboutTypeOfFuel(){
        this.typeOfFuel.typeOfFuel();
    }



    public ITypeOfDrives getTypeOfDrives() {
        return typeOfDrives;
    }

    public void setTypeOfDrives(ITypeOfDrives typeOfDrives) {
        this.typeOfDrives = typeOfDrives;
    }

    public ITypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(ITypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public INumberOfDoors getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(INumberOfDoors numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public IBodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(IBodyType bodyType) {
        this.bodyType = bodyType;
    }
}
