import java.util.Scanner;

public class Ex13 {
    /**
     * Viết một chương trình nhập vào n số nguyên, hiển thị số lần xuất hiện của số lớn nhất.
    **/
    public static void main(String[] args) {
        int max = 0;
        int frequency = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng (n) số nguyên: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập số thứ %d: ", i+1);
            int input = scanner.nextInt();
            if(input == max){
                frequency++;
            }
            if(input > max){
                max = input;
                frequency = 1;
            }
        }
        System.out.printf("Số lần xuất hiện của số lớn nhất (%d) là %d lần", max, frequency);
    }
}
