package month3.lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkOn {
    static Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("""
                Hello, welcome to app!
                1. Create a file
                2. Write to a file
                3. Read from file
                4. Delete a file""");
    }

    public static void case1() {
        try {
            System.out.println("Write file name:");
            String fileName = scanner.nextLine();
            File obj = new File(fileName.toLowerCase());
            if (obj.createNewFile()) {
                System.out.println("File " + fileName + " was created!");
            } else {
                System.out.println("File " + fileName + " was not created!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void case2() {
        try {
            System.out.println("Input a name of file:");
            String fileName = scanner.nextLine();
            File obj = new File(fileName.toLowerCase());
            if (obj.exists()) {
                FileWriter writer = new FileWriter(fileName.toLowerCase());
                System.out.println("File exists.");
                System.out.println("Input a message:");
                String input = scanner.nextLine();
                writer.write(input);
                writer.close();
                System.out.println("Message was written in file!");
            } else {
                System.out.println("File does not exist.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void case3() {
        try {
            System.out.println("Input a name of file:");
            String fileName = scanner.nextLine();
            File obj2 = new File(fileName.toLowerCase());
            if (obj2.exists()) {
                System.out.println("File exists.");
                Scanner myScanner = new Scanner(obj2);
                String data = myScanner.nextLine();
                myScanner.close();
                System.out.println("Your message: " + data);
            } else {
                System.out.println("File does not exist.");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void case4() {
        System.out.println("Write file name:");
        String fileName = scanner.nextLine();
        File obj3 = new File(fileName.toLowerCase());
        if (obj3.delete()) {
            System.out.println("File " + fileName + " was deleted!");
        } else {
            System.out.println("File " + fileName + " was not deleted!");
        }
    }

    public static void main(String[] args) {

        while (true) {
            printMenu();
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> case1();
                case "2" -> case2();
                case "3" -> case3();
                case "4" -> case4();
                default -> System.exit(0);
            }
        }
    }
}
