package lesson10.homework;
//ToDO
// Write tests for all methods in class

public class Student {
    static int id = 0;
    String name;
    String surname;
    int age;

    public Student(String name, String surname, int age) {
        id += 1;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String introduction(String name) {
        return String.format("Hello my name is %s", name);
    }

    public String hobbies() {
        return "I like reading";
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}
