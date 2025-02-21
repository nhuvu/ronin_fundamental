import java.util.Scanner;

public class Ex01 {
    /*Viết một chương trình đọc một số lượng số nguyên không xác định,
    xác định có bao nhiêu giá trị dương và âm đã được đọc và
    tính tổng và giá trị trung bình của các giá trị đầu vào (không tính số 0).
    Chương trình kết thúc khi nhập vào số 0.
     **/
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
