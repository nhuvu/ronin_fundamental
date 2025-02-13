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
        int fahrenheit = scanner.nextInt();
        System.out.printf("%d °F equals to: %.2f °C", fahrenheit, (fahrenheit - 32) / 1.8);
        System.out.printf("\n\n");

        //C to F
        System.out.print("Read °C to convert to °F: ");
        int celsius = scanner.nextInt();
        System.out.printf("%d °C equals to: %.2f °F", celsius, (celsius * 1.8) + 32);

    }
}
