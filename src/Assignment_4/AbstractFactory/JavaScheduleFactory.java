package Assignment_4.AbstractFactory;

public class JavaScheduleFactory implements IScheduleFactory{
    @Override
    public IAssignment createAssignment(IAssignment.Importance importance) {
        return new ObserverPatternAssignment(importance);
    }

    @Override
    public IPlan createPlan() {
        return new ThisWeekPlan();
    }
}
