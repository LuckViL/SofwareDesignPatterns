package PracticeWork.AbstractFactory;

public interface IResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    IStorage createStorage(int capacity);
}
