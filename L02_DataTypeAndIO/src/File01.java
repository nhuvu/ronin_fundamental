import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File01 {
    /**
     * 1 inch = 2.54cm
     * */
    public static void main(String[] args) throws FileNotFoundException {
        /*Read input from file & print to console*/
        Scanner scanner = new Scanner(new File("resources/L02/InchToCm_read.txt"));
        int inch = scanner.nextInt();
        System.out.printf("Inch to convert: %d", inch);
        scanner.close();

        /*Convert and print back result to file*/
        PrintWriter output = new PrintWriter(new File("resources/L02/InchToCm_write.txt"));
        output.printf("%d inch equals to: %.2f cm", inch, inch * 2.54);
        output.close();
    }
}
