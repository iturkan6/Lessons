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
}
