import java.util.Scanner;

public class Ex16 {
    /**
     * Viết chương trình kiểm tra một số nguyên dương bất kỳ (2 chữ số trở lên, không quá 9 chữ số)
     * có chữ số bắt đầu và kết thúc bằng nhau hay không.
     * */
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số cần kiểm tra: ");
            input = scanner.nextInt();
            if(input > 9 && input < 1000000000){
                break;
            }
        }
        scanner.close();
        if (checkMatching(input)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static boolean checkMatching (int n){
        String input = String.valueOf(n);
        return input.charAt(0) == input.charAt(input.length()-1);
    }
}
