package month1.lesson10;

import java.util.Date;

public class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    public Person(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

//    public Person() {
//    }
}

    class Employee extends Person {
        protected Date startDate;
        protected Long salary;

        public Employee(String name, int yearOfBirth, String address, Date startDate, Long salary) {
           super(name, yearOfBirth, address);


            this.startDate = startDate;
            this.salary = salary;
        }
    }

