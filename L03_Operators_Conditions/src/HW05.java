import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        scanner.close();

        System.out.printf("Chu vi hình chữ nhật: %.2f\n", (a + b) * 2);
        System.out.printf("Diện tích hình chữ nhật: %.2f", a * b);
    }
}
