import java.util.Scanner;

public class Ex03 {
    /**
     * Tính x^n (0 < x, n < 20) theo giải thuật đệ quy
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.printf("%d^%d = %d", x, n, exponentination(x,n));

    }

    public static long exponentination (int x, int n){
        if(n < 1){
            return 1;
        }
        return x * exponentination(x, n-1);
    }
}
