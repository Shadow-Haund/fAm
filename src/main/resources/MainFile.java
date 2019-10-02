import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFile {
    public static void main (String args[]) {
        File file = new File("src/main/resources/c.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Mes");
            output.println(58);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner input = new Scanner(file);
            String mes = input.nextLine();
            int num = input.nextInt();
            System.out.printf("We : %s have something %d\n", mes, num);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
