package Assignment_2;


public interface IObservable {
    void registerUser(IObserver client);
    void deleteUser(IObserver client);
    void notifyUsers();
}
