package month3.lesson3;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("filename.txt");
        if (file.delete()) {
            System.out.println("File was deleted");
        }else {
            System.out.println("File was not deleted");
        }
    }
}
