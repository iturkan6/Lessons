package lesson3;

import java.util.Objects;

public class Father {
    int age;
    String name;
    double salary;

    public Father(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return age == father.age && Objects.equals(name, father.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
//        return "Father{" + "age=" + age + ", name='" + name + '\'' + ", salary=" + salary + '}';
        return String.format("Father [name = %s, age = %d]", name, age);
    }
}


