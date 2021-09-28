package PracticeWork.DecoratorPattern;

public class Main {
    public static void main(String[] args){
        IDeveloper developer = new TeamLeadDeveloperDecorator(new SeniorJavaDeveloperDecorator(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
