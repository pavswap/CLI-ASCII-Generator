
import java.io.*;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) {

        System.out.print("Enter Command : ");
        String command = new Scanner(System.in).next();

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
