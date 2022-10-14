package month3.lesson3;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("filename.txt");
        System.out.println("Name of file " + file.getName());
        System.out.println("File size " + file.length());
        System.out.println("Check permission for write " + file.canWrite());
        System.out.println("Check permission for read " + file.canRead());
        System.out.println("Show absolute path " + file.getAbsolutePath());
    }
}
