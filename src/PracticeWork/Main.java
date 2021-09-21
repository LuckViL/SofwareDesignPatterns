package PracticeWork;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = {new SeaEagle(),new Kiwi(),new Swan(),new Ostrich(),new Penguin()};
        for (Bird bird: birds) {
            bird.display();
            bird.eat();
            bird.performFly();
            bird.performSwim();
            System.out.println("--------------------------");
        }
    }
}