package month3.lesson6;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileV2 {
    static Scanner scanner = new Scanner(System.in);

    private static void intro() {
        System.out.println(" Hello, welcome to app!");
        System.out.println("""
                1. Create a file
                2. Write to a file
                3. Read from file
                4. Delete a file""");
    }

    private static boolean checkIfFileExists(String filename) {
        java.io.File file = new java.io.File(filename.toLowerCase());
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return false;
        }
        return true;
    }

    private static void case1() {
        try {
            System.out.println("Write file name:");
            String fileName = scanner.nextLine();
            java.io.File obj = new java.io.File(fileName.toLowerCase());
            if (obj.createNewFile()) {
                System.out.println("File " + fileName + " was created!");
            } else {
                System.out.println("File " + fileName + " was not created!");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage()); // need print message
        }
    }

    private static void case2() {
        try {
            System.out.println("Input a name of file:");
            String fileName = scanner.nextLine();
            if (checkIfFileExists(fileName)) {
                FileWriter writer = new FileWriter(fileName.toLowerCase());
                System.out.println("File exists.\nInput a message:");
                writer.write(scanner.nextLine());
                writer.close();
                System.out.println("Message was written in file!");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage()); //need print message
        }
    }
    private static void case3() {
        try {
            System.out.println("Input a name of file:");
            String fileName = scanner.nextLine();
            if (checkIfFileExists(fileName)) {
                System.out.println("File exists.");
                Scanner myScanner = new Scanner(new java.io.File(fileName));
                String data = myScanner.nextLine();
                myScanner.close();
                System.out.println("Your message: " + data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); //need print message
        }
    }
    private static void case4() {
        System.out.println("Write file name:");
        String fileName = scanner.nextLine();
        java.io.File obj3 = new java.io.File(fileName.toLowerCase());
        if (obj3.delete()) {
            System.out.println("File " + fileName + " was deleted!");
        } else {
            System.out.println("File " + fileName + " was not deleted!");
        }
    }

    public static void main(String[] args) {

        while (true) {
            intro();
            switch (scanner.nextLine()) {
                case "1" -> case1();
                case "2" -> case2();
                case "3" -> case3();
                case "4" -> case4();
                default -> System.exit(0);
            }
        }
    }
}
