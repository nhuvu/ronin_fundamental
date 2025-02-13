import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/L02/MinuteConvert_read.txt"));
        int input = scanner.nextInt();
        System.out.printf("Read minute(s) to convert: %d", input);
        scanner.close();

        int year = input/525960;
        int day = (input%525960)/1440;
        int hour = ((input%525960)%1440)/60;
        int minute = ((input%525960)%1440)%60;
        PrintWriter writer = new PrintWriter(new File("resources/L02/MinuteConvert_write.txt"));
        writer.printf("%d phút => %d năm, %d ngày, %d giờ, %d phút",
                input, year, day, hour, minute);
        writer.close();
    }
}
