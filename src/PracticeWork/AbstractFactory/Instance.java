package PracticeWork.AbstractFactory;

public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void stop();

    void attachStorage(IStorage storage);
}
