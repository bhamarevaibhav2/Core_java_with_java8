package designPatterns.AbstractFactory;

public class AndroidDevFactory implements EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
}
