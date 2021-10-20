package Assignment_4.AbstractFactory;

public interface IAssignment {
    enum Importance {easy, medium, hard}

    void getContent();

    void getDeadline();

    void addToPlan(IPlan plan);
}
