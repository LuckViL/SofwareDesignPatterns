package PracticeWork.FactoryMethod;

public class CPPDeveloperFactory implements IDeveloperFactory{
    @Override
    public IDeveloper createDeveloper() {
        return new CPPDeveloper();
    }
}
