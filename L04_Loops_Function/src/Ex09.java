import java.util.Scanner;

public class Ex09 {
    /**
     * Find the 2nd largest number from an array of positive integers
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int secondMax = 0;
        while (true){
            System.out.print("Nhập một số, chương trình dừng khi nhập số âm: ");
            int num = scanner.nextInt();
            if(num < 0){
                break;
            }
            if(num >= max){
                secondMax = max;
                max = num;
            } else {
                if(num > secondMax){
                    secondMax = num;
                }
            }
        }
        scanner.close();
        System.out.printf("Số lớn thứ 2 trong dãy số đã nhập là: %d", secondMax);
    }

}
