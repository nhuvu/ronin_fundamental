import java.util.Scanner;

public class Console01 {
    /**
     * 1 inch = 2.54cm
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Read inch to convert to cm: ");
        int inch = scanner.nextInt();
        System.out.printf("%d inch equals to: %.2f cm", inch, inch * 2.54);

        scanner.close();
    }
}
