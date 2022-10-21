package month3.lesson6;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Hello, welcome to app!");
            System.out.println("""
                    1. Create a file
                    2. Write to a file
                    3. Read from file
                    4. Delete a file""");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    try {
                        System.out.println("Write file name:");
                        String fileName = scanner.next();
                        String newFile = fileName.toLowerCase(); // need create new variable
                        java.io.File obj = new java.io.File(newFile);
                        if (obj.createNewFile()) {
                            System.out.println("File " + fileName + " was created!");
                        } else {
                            System.out.println("File " + fileName + " was not created!");
                        }

                    } catch (IOException e) {
                        System.out.println(e.getMessage()); // need print message
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Input a name of file:");
                        String fileName = scanner.next();
                        java.io.File obj = new java.io.File(fileName.toLowerCase());
                        if (obj.exists()) {
                            FileWriter writer = new FileWriter(fileName.toLowerCase()); // change case
                            System.out.println("File exists.");
                            System.out.println("Input a message:");
                            scanner.nextLine(); // empty line for fixing java scanner bug
                            String s = scanner.nextLine();
                            writer.write(s);
                            writer.close();
                            System.out.println("Message was written in file!");
                        } else {
                            System.out.println("File does not exist.");
                        }

                    } catch (IOException e) {
                        System.out.println(e.getMessage()); //need print message
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Input a name of file:");
                        String fileName = scanner.next();
                        java.io.File obj2 = new java.io.File(fileName.toLowerCase());
                        if (obj2.exists()) {
                            System.out.println("File exists.");
                            Scanner myScanner = new Scanner(obj2);
                            String data = "";
                            while (myScanner.hasNextLine()) {
                                data = myScanner.nextLine(); // wrong scanner
                            }
                            myScanner.close();
                            System.out.println("Your message: " + data);
                        } else {
                            System.out.println("File does not exist.");
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage()); //need print message
                    }
                    break;

                case 4:
                    System.out.println("Write file name:");
                    String fileName = scanner.next();
                    java.io.File obj3 = new java.io.File(fileName.toLowerCase());
                    if (obj3.delete()) {
                        System.out.println("File " + fileName + " was deleted!");
                    } else {
                        System.out.println("File " + fileName + " was not deleted!");
                    }
                    break;
            }
        }
    }
}
