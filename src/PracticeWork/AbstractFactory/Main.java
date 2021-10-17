package PracticeWork.AbstractFactory;

public class Main {
    private IResourceFactory factory;

    public Main(IResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int mb){
        Instance instance = factory.createInstance(capacity);
        IStorage storage = factory.createStorage(mb);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args){
        Main client = new Main(new GoogleResourceFactory());
        Instance i1 = client.createServer(Instance.Capacity.micro,2000);

        i1.start();
        i1.stop();
    }
}
