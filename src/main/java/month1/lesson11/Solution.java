package month1.lesson11;

import java.util.Objects;

public class Solution {

    static int id = 0;
    String name;
    String surname;
    int clazz = 4;

    public Solution() {

    }

    public Solution(String name, String surname, int clazz) {
        this.id += 1;
        this.name = name;
        this.surname = surname;
        this.clazz = clazz;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution = (Solution) o;

        if (clazz != solution.clazz) return false;
        if (!Objects.equals(name, solution.name)) return false;
        return Objects.equals(surname, solution.surname);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + clazz;
        return result;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id + " " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}

