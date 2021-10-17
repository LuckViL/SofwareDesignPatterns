package PracticeWork.AbstractFactory;

public class AWSResourceFactory implements IResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public IStorage createStorage(int capacity) {
        return new S3Storage(capacity);
    }
}
