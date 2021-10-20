package Assignment_4.AbstractFactory;

public class Main {
    private IScheduleFactory factory;

    public Main(IScheduleFactory factory) {
        this.factory = factory;
    }

    public IAssignment createServer(IAssignment.Importance importance){
        IAssignment assignment = factory.createAssignment(importance);
        IPlan plan = factory.createPlan();
        assignment.addToPlan(plan);
        return assignment;
    }

    public static void main(String[] args){
        Main client = new Main(new DBMSScheduleFactory());
        IAssignment i1 = client.createServer(IAssignment.Importance.hard);

        i1.getContent();
        i1.getDeadline();
    }
}
