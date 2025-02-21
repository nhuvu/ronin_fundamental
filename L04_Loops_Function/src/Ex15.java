import java.util.Scanner;

public class Ex15 {
    /**
     * Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a,b.
     * */
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số nguyên dương a: ");
            a = scanner.nextInt();
            if(a > 0){
                break;
            }
        }
        System.out.println("-------");
        while (true){
            System.out.print("Nhập số nguyên dương b: ");
            b = scanner.nextInt();
            if(b > 0){
                break;
            }
        }
        scanner.close();
        System.out.printf("Ước chung lớn nhất của %d và %d là: %d \n", a, b, greatestDivisor(a,b));
        System.out.printf("Bội chung nhỏ nhất của %d và %d là: %d \n", a, b, lowestMultiple(a,b));
    }

    public static int greatestDivisor(int a, int b){
        /**
         * So sánh a & b, số nào nhỏ hơn thì tìm ước của số đó (loop từ số đó đến 1)
         * Tìm được số nào mà cả 2 số a & b đều chia hết thì dừng loop và trả ra số đó
         * */
        if(a > b){
            for(int i = b; i >= 2; i--){
                if(a % i == 0 && b % i == 0){
                    return i;
                }
            }
        }else{
            for(int i = a; i >= 2; i--){
                if(a % i == 0 && b % i == 0){
                    return i;
                }
            }
        }
        return 1;
    }

    public static int lowestMultiple(int a, int b){
        /**
         * So sánh a & b, số nào nhỏ hơn thì tìm bội của số đó (lấy số đó nhân 1 số, bắt đầu từ 2 & tăng dần lên)
         * Tìm được bội số nào mà chia hết cho số còn lại thì dừng loop và trả ra số đó
         * */
        int i = 2;
        if(a > b){
            while (true){
                if((b * i) % a == 0){
                    return b * i;
                }
                i++;
            }
        }else {
            while (true){
                if((a * i) % b == 0){
                    return a * i;
                }
                i++;
            }
        }
    }
}
