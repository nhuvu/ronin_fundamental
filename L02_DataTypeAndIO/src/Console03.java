import java.util.Scanner;

public class Console03 {
    /**
     * 1 year = 525960 min
     * 1 day = 1440 min
     * 1 hour = 60 min
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Read minute(s) to convert: ");
        int input = scanner.nextInt();
        int year = input/525960;
        int day = (input%525960)/1440;
        int hour = ((input%525960)%1440)/60;
        int minute = ((input%525960)%1440)%60;
        System.out.printf("%d phút => %d năm, %d ngày, %d giờ, %d phút",
                input, year, day, hour, minute);
    }
}
