import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File02 {
    /*
    °C = (°F - 32) ÷ 1.8
    °F = °C * 1.8 + 32
    * */
    public static void main(String[] args) throws FileNotFoundException {
        //F to C
        Scanner scanner = new Scanner(new File("resources/L02/FtoC_read.txt"));
        int fahrenheit = scanner.nextInt();
        System.out.printf("Read °F from file to convert to °C: %d", fahrenheit);
        scanner.close();
        PrintWriter writer = new PrintWriter(new File("resources/L02/FtoC_write.txt"));
        writer.printf("%d °F equals to: %.2f °C", fahrenheit, (fahrenheit - 32) / 1.8);
        writer.close();

        //C to F
        System.out.println();
        scanner = new Scanner(new File("resources/L02/CtoF_read.txt"));
        int celsius = scanner.nextInt();
        System.out.printf("Read °C from file to convert to °F: %d", celsius);
        writer = new PrintWriter("resources/L02/CtoF_write.txt");
        writer.printf("%d °C equals to: %.2f °F", celsius, (celsius * 1.8) + 32);
        writer.close();

    }
}
