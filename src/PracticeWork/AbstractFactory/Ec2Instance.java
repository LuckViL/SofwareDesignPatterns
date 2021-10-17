package PracticeWork.AbstractFactory;

public class Ec2Instance implements Instance{
    public Ec2Instance(Capacity capacity) {
        System.out.println("Instance of Ec2 created with capacity " + capacity);
    }

    @Override
    public void start() {
        System.out.println("Ec2 started...");
    }

    @Override
    public void stop() {
        System.out.println("Ec2 stopped...");
    }

    @Override
    public void attachStorage(IStorage storage) {
        System.out.println("Ec2 instance attached storage: " + storage);
    }
}
