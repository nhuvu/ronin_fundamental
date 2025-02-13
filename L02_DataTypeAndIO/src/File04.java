import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class File04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/L02/DateTime_read.txt"));
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.printf("Read input to convert to DateTime: %d %d %d", day, month, year);
        scanner.close();

        LocalDate ld = LocalDate.of( year, month, day);
        DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );
        String output  = ld.format(f);

        PrintWriter writer = new PrintWriter(new File("resources/L02/DateTime_write.txt"));
        writer.printf("%s", output);
        writer.close();
    }
}
