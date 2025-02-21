import java.util.Scanner;

public class Ex17 {
    /**
     * Hãy phân tích một số nguyên dương thành tích các thừa số nguyên tố.  Ví dụ 60 = 2^2 x 3^1 x 5^1
     * */
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập 1 số nguyên dương: ");
            input = scanner.nextInt();
            if(input > 0){
                break;
            }
        }
        scanner.close();

        for(int i = 2; i <= input/2; i++){
            if(checkPrime(i)){
                int times = 0;
                while (true){
                    input /= i;
                    times++;
                    if(input % i != 0){
                        break;
                    }
                }
                System.out.printf("Số tờ mệnh giá %d là: %d \n", i, numPaper);
            }
        }
        System.out.printf("Tổng số tờ nhận được: %d tờ", sumPaper);
    }

    public static boolean checkPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
