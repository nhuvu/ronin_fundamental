import java.util.Scanner;

public class Ex19 {
    /**
     * Một số được gọi là số tăng giảm nếu số đó có các chữ số thỏa mãn hoặc không giảm,
     * hoặc không tăng từ trái qua phải. Hãy kiểm tra xem một số có phải số tăng giảm hay không.
     * Ví dụ nhập vào 2345566778899 ⇒ kết quả in ra YES, nhập vào 4343531987 ⇒ kết quả in ra NO.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        long input = scanner.nextLong();
        scanner.close();

        if(checkIncrease(input) || checkDecrease(input)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkIncrease (long n){
        if(n < 10){
            return false;
        }
        String input = String.valueOf(n);
        for(int i = 1; i < input.length(); i++){
            int current = input.charAt(i);
            int previous = input.charAt(i-1);
            if(current < previous){
                return false;
            }
        }
        return true;
    }

    public static boolean checkDecrease (long n){
        if(n < 10){
            return false;
        }
        String input = String.valueOf(n);
        for(int i = 1; i < input.length(); i++){
            int current = input.charAt(i);
            int previous = input.charAt(i-1);
            if(current > previous){
                return false;
            }
        }
        return true;
    }
}
