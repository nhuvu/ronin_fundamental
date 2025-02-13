import java.util.Scanner;

public class Console05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Read name: ");
        String name = scanner.nextLine();
        System.out.print("Read age: ");
        int age = scanner.nextInt();
        System.out.print("Read height: ");
        float height = scanner.nextFloat();
        System.out.println();
        System.out.printf("Họ và tên: %s \nTuổi: %d \nChiều cao: %.2fm", name, age, height);
    }
}
