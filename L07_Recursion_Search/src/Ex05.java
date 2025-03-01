import java.util.Scanner;

public class Ex05 {
    /**
     * Hãy sử dụng đệ quy để giải quyết bài toán này. Cho dãy số A[] gồm N số nguyên dương.
     * Tam giác đặc biệt của dãy số A[] là tam giác được tạo ra bởi n hàng,
     * trong đó hàng thứ 1 là dãy số A[], hàng i là tổng hai phần tử liên tiếp của hàng i-1 (2 ≤ i ≤ n).
     * Ví dụ A[] = {1, 2, 3, 4, 5}, khi đó tam giác được tạo nên như dưới đây:
     * [1, 2, 3, 4, 5]
     * [3, 5, 7, 9]
     * [8, 12, 16]
     * [20, 28]
     * [48]
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cho mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập số: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        printTriangle(array, n);
    }

    public static void printTriangle (int[] array, int n){
        if(n == 0){
            return;
        }
        for(int i = 0; i < n; i++){
            if(i < n - 1){
                System.out.printf("%d, ", array[i]);
            }else {
                System.out.printf("%d", array[i]);
            }
        }
        System.out.println();
        int[] newArr = new int[n-1];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = array[i] + array[i+1];
        }
        printTriangle(newArr, n - 1);
    }
}
