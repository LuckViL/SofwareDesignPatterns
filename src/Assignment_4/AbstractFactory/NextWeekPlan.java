package Assignment_4.AbstractFactory;

public class NextWeekPlan implements IPlan{
    @Override
    public String getContent() {
        return "Finish DBMS project.";
    }

    @Override
    public String toString() {
        return "next week plan.";
    }
}
