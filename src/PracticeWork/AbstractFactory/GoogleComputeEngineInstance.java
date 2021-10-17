package PracticeWork.AbstractFactory;

public class GoogleComputeEngineInstance implements Instance{
    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("GCE created with capacity " + capacity);
    }

    @Override
    public void start() {
        System.out.println("GCE started...");
    }

    @Override
    public void stop() {
        System.out.println("GCE stopped...");
    }

    @Override
    public void attachStorage(IStorage storage) {
        System.out.println("GCE instance attached storage: " + storage);
    }
}
