import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW04 {
    /**
     * Viết một hàm nhập vào một mảng 3 chiều và in ra ra các giá trị của mảng 3 chiều vào file text.
     * */
    public static void main(String[] args) throws FileNotFoundException {
        int[][][] matrix = create3dArrayFromConsole();
        printArrayToFile(matrix, "resources/L09/HW04_write.txt");
    }

    public static int[][][] create3dArrayFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều 1: ");
        int i = scanner.nextInt();
        System.out.print("Nhập chiều 2: ");
        int j = scanner.nextInt();
        System.out.print("Nhập chiều 3: ");
        int k = scanner.nextInt();

        int[][][] matrix = new int[i][j][k];
        for(int m = 0; m < i; m++){
            for(int n = 0; n < j; n++){
                for(int q = 0; q < k; q++){
                    System.out.printf("Nhập số [%d][%d][%d]: ",m,n,q);
                    matrix[m][n][q] = scanner.nextInt();
                }

            }
        }
        return matrix;
    }

    public static void printArrayToFile(int[][][] array, String file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(file));
        for(int i = 0; i < array.length; i++){
            System.out.print("[");
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    writer.print(array[i][j][k] + " ");
                }

            }
            System.out.println("]");
        }
        writer.close();
    }
}
