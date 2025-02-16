import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số để kiểm tra: ");
        int number = scanner.nextInt();
        scanner.close();
        //Check chẵn-lẻ
        if(number % 2 == 0){
            System.out.printf("%d là số chẵn \n", number);
        }else {
            System.out.printf("%d là số lẻ \n", number);
        }
        //Check âm-dương
        if(number < 0){
            System.out.printf("%d là số âm", number);
        } else if (number > 0) {
            System.out.printf("%d là số dương", number);
        } else {
            System.out.printf("%d không âm cũng không dương", number);
        }
    }
}
