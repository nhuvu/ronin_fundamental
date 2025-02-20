import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        scanner.close();

        long tong = (long) a + (long) b;
        long hieu = (long) a - (long) b;
        long tich = (long) a * (long) b;
//
        System.out.printf("Tổng của a và b: %d\n", tong);
        System.out.printf("Hiệu của a và b: %d\n", hieu);
        System.out.printf("Tích của a và b: %d\n", tich);
        System.out.printf("Tong: %d\n", a + b);
        System.out.printf("Tich: %d", a * b);

//        if(b == 0){
//            System.out.println("Không thể chia cho 0");
//        } else {
//            float thuong = (float) a / (float) b;
//            System.out.printf("Tích của a và b: %.2f", thuong);
//        }


    }
}
