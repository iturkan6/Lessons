package month2.lesson5.daoStructure;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        System.out.println(dao.getAll().toString());
    }
}
