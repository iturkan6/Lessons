package month2.lesson5.daoStructure;

import java.util.List;

public interface DAO<T> {
    public List<T> getAll();

    public T getStudent(int id);

    public void updateStudent(T t);

    public void deleteStudent(T t);
}
