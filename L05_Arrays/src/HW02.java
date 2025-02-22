import java.util.Scanner;

public class HW02 {
    /**
     * Nhập vào một mảng và số nguyên n. Trả về index của số nguyên n có trong mảng,
     * nếu không có trả về -1.
     * */
    public static void main(String[] args) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cho mảng: ");
        int num = scanner.nextInt();

        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("Nhập số: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();
        scanner.close();

        for(int i = 0; i < array.length; i++){
            if(array[i] == N){
                index = i + 1;
                break;
            }else {
                index = -1;
            }
        }
        System.out.println("Index của N: " + index);
    }
}
