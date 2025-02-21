import java.util.Scanner;

public class Ex20 {
    /**
     * Cho số nguyên dương N. Nhiệm vụ của bạn là hãy xác định xem có bao nhiêu ước số của N chia hết cho 2.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        while(true){
            System.out.print("Nhập số nguyên dương N: ");
            n = scanner.nextInt();
            if(n > 0){
                break;
            }
        }
        scanner.close();
        System.out.printf("Các ước số của %d chia hết cho 2 gồm: \n", n);
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0 && i % 2 == 0){
                sum++;
                System.out.println(i);
            }
        }
        System.out.printf("Có %d ước số của %d chia hết cho 2", sum, n);
    }


}
