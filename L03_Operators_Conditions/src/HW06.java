import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        scanner.close();

        /**Tam giác: các cạnh lớn hơn 0 và tổng 2 cạnh bất kỳ phải lớn hơn cạnh còn lại*/
        if(a > 0 && b > 0 && c > 0
                && a + b > c && a + c > b && b + c > a){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
