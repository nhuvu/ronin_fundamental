import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        scanner.close();

        if(a > b){
            System.out.println("a lớn hơn b");
        } else if (a < b) {
            System.out.println("a nhỏ hơn b");
        }else {
            System.out.println("a bằng b");
        }
    }
}
