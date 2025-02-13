import java.util.Scanner;

public class Console01 {
    /**
     * 1 inch = 2.54cm
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put inch to convert to cm: ");
        int inch = scanner.nextInt();
        System.out.printf("Your result: %.2f", inch * 2.54);
    }
}
