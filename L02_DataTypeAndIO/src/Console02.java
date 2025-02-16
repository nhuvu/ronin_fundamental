import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Console02 {
    /*
    °C = (°F - 32) ÷ 1.8
    °F = °C * 1.8 + 32
    * */
    public static void main(String[] args) throws FileNotFoundException {
        //F to C
        Scanner scanner = new Scanner(System.in);
        System.out.print("Read °F to convert to °C: ");
        double fahrenheit = scanner.nextDouble();
        System.out.printf("%f °F equals to: %.2f °C\n\n", fahrenheit, (fahrenheit - 32) / 1.8);

        //C to F
        System.out.print("Read °C to convert to °F: ");
        double celsius = scanner.nextDouble();
        System.out.printf("%f °C equals to: %.2f °F", celsius, (celsius * 1.8) + 32);

        scanner.close();


    }
}
