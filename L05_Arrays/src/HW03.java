import java.util.Scanner;

public class HW03 {
    /**
     * Nhập vào một mảng hai chiều, Trả về phần tử lớn nhất có trong mảng hai chiều.
     * */
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột:");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("Nhập số vị trí [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        scanner.close();
        System.out.println("Phần tử lớn nhất có trong mảng hai chiều: " + max);
    }
}
