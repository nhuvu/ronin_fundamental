import javax.swing.*;
import java.util.Scanner;

public class Ex08 {
    /**
     * Một người cần rút một số tiền T từ ngân hàng và muốn tổng số tờ ít nhất.
     * Cho biết có các loại tiền mệnh giá 500, 200, 100, 20, 10, 5, 2 và 1.
     * Nhập từ bàn phím số tiền T và in ra số tờ mỗi loại mệnh giá và tổng số tờ nhận được.
     * */
    public static void main(String[] args) {
        int numPaper1;
        int numPaper2;
        int numPaper5;
        int numPaper10;
        int numPaper20;
        int numPaper100;
        int numPaper200;
        int numPaper500;
        int input;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập số tiền T ");
            input = scanner.nextInt();
            if(input > 0){
                break;
            }
        }
        scanner.close();

    }
}
