package designPatterns.AbstractFactory;

public class WebDevFactory implements EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {

        return new WebDev();
    }
}
