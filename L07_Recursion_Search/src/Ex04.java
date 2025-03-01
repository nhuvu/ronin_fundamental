import java.util.Scanner;

public class Ex04 {
    /**
     * Tính tổng 1 + 2 + 3 + … + n (0 < n < 1000) theo giải thuật đệ quy
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Tổng 1 + 2 + 3 + … + n là: " + sum(n));
    }

    public static int sum (int n){
        if(n == 0){
            return 0;
        }
        int n_1 = n - 1;
        return n + sum(n_1);
    }
}
