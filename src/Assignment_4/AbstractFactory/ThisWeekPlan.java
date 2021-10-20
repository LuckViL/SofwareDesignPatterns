package Assignment_4.AbstractFactory;

public class ThisWeekPlan implements IPlan{
    @Override
    public String getContent() {
        return "Finish all deadlines.";
    }

    @Override
    public String toString() {
        return "this week plan.";
    }
}
