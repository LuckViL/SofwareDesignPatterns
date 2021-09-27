package PracticeWork.ObserverPatternOwn;

public interface IObservable {
    void registerUser(IObserver user);
    void deleteUser(IObserver user);
    void notifyUsers();
}
