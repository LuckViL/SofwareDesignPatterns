package PracticeWork.AbstractFactory;

public class S3Storage implements IStorage{
    public S3Storage(int capacity) {
        System.out.println("S3Storage with capacity " + capacity + " created");
    }

    @Override
    public String getID() {
        return "S3 storage";
    }

    @Override
    public String toString() {
        return "S3Storage";
    }
}
