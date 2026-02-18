package test2;

import java.io.*;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) {

        appLoop();

    }

    public static void appLoop() {

        var sc = new Scanner(System.in);

        while(true) {
            System.out.print("\nEnter H for help\nEnter x to exit\nEnter Command :");

            String command = sc.next();

            if(command.equals("X") || command.equals("x")) {
                break;
            }
            else if(command.equals("H")) {
                System.out.println("""
                        This is the command guide to all ASCII art :
                        amb : Amobia
                        grl : girl
                        fsc : face
                        """);
            }
            else {
                printArt(command);
                System.out.println("\nArt Credit : The ASCII Art Archive");
            }
        }
    }

    public static void printArt(String command) {

        try {
            var reader = new BufferedReader(new FileReader("sample.txt"));

            String line;
            while((line = reader.readLine()) != null) {

                if(line.equals(command)) {
                    while ((line = reader.readLine()) != null &&
                            !line.equals("/" + command)) {
                        System.out.println(line);
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
