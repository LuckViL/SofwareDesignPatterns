package Assignment_1;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {new ToyotaMirai(), new ChevroletCorvette()};
        for (Car car: cars) {
            car.display();
            car.aboutNumberOfDoors();
            car.aboutBodyType();
            car.aboutTypeOfDrives();
            car.aboutTypeOfFuel();
            System.out.println("--------------------------");
        }
    }
}