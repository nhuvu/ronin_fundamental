import java.util.Scanner;

public class Ex13 {
    /*
    * Read n number of integers and print the frequency of the max number
    **/
    public static void main(String[] args) {
        int max = 0;
        int frequency = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng (n) số nguyên: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập số thứ %d: ", i+1);
            int input = scanner.nextInt();
            if(input >= max){
                max = input;
                frequency++;
            }
        }
        System.out.printf("Số lần xuất hiện của số lớn nhất trong %d số nguyên đã nhập là: %d lần", n, frequency);
    }
}
