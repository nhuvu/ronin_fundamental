import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Console04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Read input to convert to DateTime: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        LocalDate ld = LocalDate.of( year, month, day);
        DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );
        String output  = ld.format(f);
        System.out.printf("%s", output);
    }
}
