package month2.lesson5.daoStructure;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements DAO<Student> {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudents() {
        students.add(new Student("Tom", 0));
        students.add(new Student("Kate", 1));
        students.add(new Student("Jack", 2));
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student getStudent(int id) {
        for (Student student: students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) {
        for (Student el: students) {
            if (el.getId() == student.getId()) {
                el = student;
            }
        }
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
    }
}
