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

        String output = input + " = ";
        for(int i = 2; i <= input; i++){
            int times = 0;
            if(checkPrime(i)){
                while (true){
                    if(input % i != 0){
                        break;
                    }
                    input /= i;
                    times++;
                }
                if(input > 1){
                    output = output + i + "^" + times + " x ";
                }else {
                    output = output + i + "^" + times;
                }

            }
        }
        System.out.println(output);
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
