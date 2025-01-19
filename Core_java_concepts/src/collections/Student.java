package collections;

public class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }

    @Override
    public int compareTo(Student o) {
        return age - o.age;
    }

}
