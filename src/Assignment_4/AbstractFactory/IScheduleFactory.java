package Assignment_4.AbstractFactory;

public interface IScheduleFactory {
    IAssignment createAssignment(IAssignment.Importance importance);

    IPlan createPlan();
}
