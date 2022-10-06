package month3.lesson1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("filename.txt");
            writer.write("Its very cool to write to file in Java");
            writer.close();
        }catch (IOException ex){
            System.out.println("Error occurred");
            ex.printStackTrace();
        }
    }
}
