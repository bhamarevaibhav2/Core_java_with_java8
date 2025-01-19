package designPatterns.AbstractFactory;

public class EmployeeFactory {

    public static Employee createEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
