package PracticeWork.AbstractFactory;

public class GoogleResourceFactory implements IResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public IStorage createStorage(int capacity) {
        return new GoogleCloudStorage(capacity);
    }
}
