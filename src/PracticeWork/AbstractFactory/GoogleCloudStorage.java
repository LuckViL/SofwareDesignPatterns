package PracticeWork.AbstractFactory;

public class GoogleCloudStorage implements IStorage{
    public GoogleCloudStorage(int capacity) {
        System.out.println("Google storage created with capacity: " + capacity);
    }

    @Override
    public String getID() {
        return "Google storage";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage";
    }
}
