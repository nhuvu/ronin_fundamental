import java.util.Scanner;

public class Ex01 {
    /*Read unidentified number of integers and:
    * - count number of positive
    * - count number of negative
    * - sum all num
    * - calculate average**/
    public static void main(String[] args) {
        int allNum = 0;
        int positiveNum = 0;
        int negativeNum = 0;
        int sum = 0;
        float average = 0.0f;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Nhập một số, chương trình dừng khi nhập 0: ");
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            allNum++;
            sum += input;
            if(input > 0){
                positiveNum++;
            } else{
                negativeNum++;
            }
        }
        scanner.close();
        average = sum / (float) allNum;
        System.out.printf("Có %d số dương được đọc\n", positiveNum);
        System.out.printf("Có %d số âm được đọc\n", negativeNum);
        System.out.printf("Tổng các số đã đọc là %d\n", sum);
        System.out.printf("Giá trị trung bình các số đã đọc là: %d / %d = %.2f", sum, allNum, average);
    }
}
