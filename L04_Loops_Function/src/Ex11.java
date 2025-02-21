import java.util.Scanner;

public class Ex11 {
    /**
     * Liệt kê tất cả số chính phương nhỏ hơn n ( n > 0).
     * Input là một số n. Output sẽ in ra danh sách số chính phương nhỏ hơn n.
     * (Số chính phương là số có thể biểu diễn dưới dạng bình phương của một số nguyên khác.
     * Ví dụ 16 là số chính phương vì 16 = 4^2).
     * */
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số N (N > 0): ");
            n = scanner.nextInt();
            if(n > 0){
                break;
            }
        }
        System.out.println("Các số chính phương nhỏ hơn N: ");
        for(int i = 1; i < n; i++){
            if(isSquareNumber(i)){
                System.out.println(i);
            }
        }
        scanner.close();
    }

    public static boolean isSquareNumber (int n){
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0 && n == i*i){
                return true;
            }
        }
        return false;
    }
}
