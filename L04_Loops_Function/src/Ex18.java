import java.util.Scanner;

public class Ex18 {
    /**
     * Cho một phép toán có dạng a+b=c với a,b,c chỉ là các số nguyên dương có một chữ số.
     * Hãy kiểm tra xem phép toán đó có đúng hay không.
     * Ví dụ nhập vào 1+2=3 ⇒ kết quả in ra YES, nhập vào 2+2=5 ⇒ kết quả in ra NO.
     * */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số nguyên dương a có 1 chữ số: ");
            a = scanner.nextInt();
            if(a > 0 && a < 10){
                break;
            }
        }
        System.out.println("-------");
        while (true){
            System.out.print("Nhập số nguyên dương b có 1 chữ số: ");
            b = scanner.nextInt();
            if(b > 0 && b < 10){
                break;
            }
        }
        System.out.println("-------");
        while (true){
            System.out.print("Nhập số nguyên dương c có 1 chữ số: ");
            c = scanner.nextInt();
            if(c > 0 && c < 10){
                break;
            }
        }
        System.out.println("-------");
        scanner.close();
        System.out.println(checkAccuracy(a,b,c));
    }

    public static String checkAccuracy(int a, int b, int c){
        return a + b == c ? "YES" : "NO";
    }
}
