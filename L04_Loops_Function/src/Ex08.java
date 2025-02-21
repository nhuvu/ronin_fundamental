import javax.swing.*;
import java.util.Scanner;

public class Ex08 {
    /**
     * Một người cần rút một số tiền T từ ngân hàng và muốn tổng số tờ ít nhất.
     * Cho biết có các loại tiền mệnh giá 500, 200, 100, 20, 10, 5, 2 và 1.
     * Nhập từ bàn phím số tiền T và in ra số tờ mỗi loại mệnh giá và tổng số tờ nhận được.
     * */
    public static void main(String[] args) {
        int input;
        int sumPaper = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số tiền T: ");
            input = scanner.nextInt();
            if(input > 0){
                break;
            }
        }
        scanner.close();

        for(int i = 500; i >=1; i--){
            if(i == 500 || i == 200 || i == 100 || i == 20 || i == 10 || i == 5 || i == 2 || i == 1){
                int numPaper = input / i;
                input %= i;
                sumPaper += numPaper;
                System.out.printf("Số tờ mệnh giá %d là: %d \n", i, numPaper);
            }
        }
        System.out.printf("Tổng số tờ nhận được: %d tờ", sumPaper);
    }
}
