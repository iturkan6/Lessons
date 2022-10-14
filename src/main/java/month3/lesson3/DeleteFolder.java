package month3.lesson3;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\iturk\\Desktop\\Projects\\Java\\lessons\\src\\main\\java\\month3\\lesson3\\hello");
        if (file.delete()) {
            System.out.println("File was deleted");
        }else {
            System.out.println("File was not deleted");
        }
    }
}
