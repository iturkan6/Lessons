import lesson10.homework.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student student;

    @BeforeEach
    public void setUp(){
        this.student = new Student();
    }

    @Test
    void changeNameTest(){
        student.changeName("Tom");
        String name = student.getName();
        assertEquals("Tom", name);
    }
    @Test
    void toStringTest(){
        Student student1 = new Student("Tom", "Cruze", 50, 5);
        String result = "Student{id=5, name='Tom', surname='Cruze', age=50}";
        assertEquals(result, student1.toString());
    }
}
