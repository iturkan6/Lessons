package month3.lesson1;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
            if(obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException ex) {
            System.out.println("Error occurred.");
            ex.getStackTrace();
        }

    }
}
