import java.util.Scanner;

public class Ex14 {
    /**
     * Viết một chương trình nhập vào một string và
     * hiển thị ra ký tự có số lần xuất hiện nhiều nhất trong string đó.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input);
        System.out.println("Ký tự có số lần xuất hiện nhiều nhất trong chuỗi: " + highestFrequency(input));
    }

    public static char highestFrequency (String s){
        /**
         * Nếu có hơn 1 ký tự có cùng số lần xuất hiện lớn nhất thì ưu tiên in ký tự duyệt đầu trong loop
         * Vd: intelligent -> 2 chữ i, 2 chữ n, 2 chữ l, 2 chữ e -> i xuất hiện đầu tiên khi duyệt loop
         * -> in i
         * */
        char mostFrequent = '\u0000';
        int maxCharDisplay = 1;
        for(int i = 0; i < s.length(); i++){
            int currentCharDisplay = 1;
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    currentCharDisplay++;
                }
            }
            if(currentCharDisplay > maxCharDisplay){
                maxCharDisplay = currentCharDisplay;
                mostFrequent = s.charAt(i);
            }
        }
        return mostFrequent;
    }
}
