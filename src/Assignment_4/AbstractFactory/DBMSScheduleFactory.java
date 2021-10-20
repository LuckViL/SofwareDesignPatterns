package Assignment_4.AbstractFactory;

public class DBMSScheduleFactory implements IScheduleFactory{
    @Override
    public IAssignment createAssignment(IAssignment.Importance importance) {
        return new EndTermProjectAssignment(importance);
    }

    @Override
    public IPlan createPlan() {
        return new NextWeekPlan();
    }
}
