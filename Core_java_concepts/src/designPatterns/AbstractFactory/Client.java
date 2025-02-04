package designPatterns.AbstractFactory;

//Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
//
//An Abstract Factory Pattern is also known as Kit.
//
//Advantage of Abstract Factory Pattern
//Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
//It eases the exchanging of object families.
//It promotes consistency among objects.
//Usage of Abstract Factory Pattern
//When the system needs to be independent of how its object are created, composed, and represented.
//When the family of related objects has to be used together, then this constraint needs to be enforced.
//When you want to provide a library of objects that does not show implementations and only reveals interfaces.
//When the system needs to be configured with one of a multiple family of objects.

public class Client {

    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.createEmployee(new AndroidDevFactory());

        System.out.println(e1.getName());

        Employee e2 = EmployeeFactory.createEmployee(new WebDevFactory());

        System.out.println(e2.getName());
    }
}
