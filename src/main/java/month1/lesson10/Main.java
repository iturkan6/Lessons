package month1.lesson10;

public class Main {
    public static void main(String[] args) {
//        Robot robot = new Robot(); // no argument contructor
//        Robot robot1 = new Robot("Rob", "VB-23"); // argument contructor
//        Robot robot2 = new Robot("Rex");
        Patient patient = new Patient();

        patient.name = "Mary";
        patient.age = 24;

        System.out.println(patient.name + " " + patient.age); // Mary 24

        Patient p = patient;

        System.out.println(p.name + " " + p.age); // Mary 24


        int a = 5;
        int b = a;
        a = 3;
        System.out.println(a + "" + b); // b = 5, a = 3;


        patient.age = 25;
        System.out.println(p.age); // 25

    }
}
