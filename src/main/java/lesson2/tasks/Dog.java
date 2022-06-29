package lesson2.tasks;

public class Dog implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("gav gav");
    }
}
