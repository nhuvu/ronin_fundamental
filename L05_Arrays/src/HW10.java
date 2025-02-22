import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    /**
     * Viết các hàm thao tác với mảng hai chiều theo mô tả dưới đây và minh họa sử dụng các hàm đó
     * */
    public static void main(String[] args) throws FileNotFoundException {
        //1. Nhập vào mảng hai chiều từ màn hình console.
        int[][] matrixConsole = inputFromConsole();

        //2. Nhập vào mảng hai chiều từ File (tham số của hàm có truyền vào đường dẫn của file dạng String)
        int[][] matrixFile = inputFromFile("resources/L09/HW10_read.txt");

        //3. Hiển thị các phần tử của mảng hai chiều ra màn hình console
        System.out.println("Mảng đọc từ màn hình console: ");
        printArrayToConsole(matrixConsole);
        System.out.println();

        //4. Hiển thị các phần tử của mảng hai chiều ra File (tham số của hàm có truyền vào đường dẫn của file dạng String)
        printArrayToFile(matrixFile, "resources/L09/HW10_write.txt");

        //5. Tính tổng các phần tử trong mảng hai chiều
        System.out.println("Tổng các phần tử: " + sumArray(matrixConsole));

        //6. Tìm số lớn nhất có trong mảng hai chiều
        System.out.println("Số lớn nhất trong mảng: " + findMax(matrixConsole));

        //7. Tìm số nhỏ nhất có trong mảng hai chiều
        System.out.println("Số nhỏ nhất trong mảng: " + findMin(matrixConsole));

        //8. Tìm vị trí của phần tử nhỏ nhất trong mảng hai chiều.
        int[] minIndex = findMinIndex(matrixConsole);
        System.out.printf("Vị trí của phần tử nhỏ nhất: {%d, %d} \n", minIndex[0], minIndex[1]);

        //9. Tìm vị trí của phần tử lớn nhất trong mảng hai chiều.
        int[] maxIndex = findMaxIndex(matrixConsole);
        System.out.printf("Vị trí của phần tử lớn nhất: {%d, %d} \n", maxIndex[0], maxIndex[1]);

        //10. Tìm vị trí của phần tử đầu tiên có giá trị bằng n. Nếu không có thì trả về { -1, -1 }
        int[] firstIndex = findFirstIndex(matrixConsole,5);
        System.out.printf("Vị trí của phần tử đầu tiên có giá trị bằng 5: {%d, %d} \n", firstIndex[0], firstIndex[1]);

        //11. Tìm vị trí của phần tử cuối cùng có giá trị bằng n. Nếu không có thì trả về { -1, -1 }
        int[] lastIndex = findLastIndex(matrixConsole,5);
        System.out.printf("Vị trí của phần tử cuối cùng có giá trị bằng 5: {%d, %d} \n", lastIndex[0], lastIndex[1]);

        //12. Hoán đổi giá trị của hai phần tử bất kỳ trong mảng. Tham số nhận vào vị trí của hai phần tử cần hoán đổi.
        // Ví dụ { 1, 2 }, { 3, 4 }
        System.out.println("Mảng sau khi hoán đổi giá trị vị trí thứ {1, 1} & {2, 3}: ");
        printArrayToConsole(switchElement(matrixConsole, new int[]{1, 1}, new int[]{2, 3}));
    }

    public static int[][] inputFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("Nhập số [%d][%d]: ",i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return array;
    }

    public static int[][] inputFromFile(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        int row = 0;
        int col = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] ele = line.split("\\s+");
            col = Math.max(col,ele.length);
            row++;
        }
        scanner.close();

        int[][] matrix = new int[row][col];
        scanner = new Scanner(new File(file));
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = scanner.nextInt();
            }

        }
        scanner.close();
        return matrix;
    }
    public static void printArrayToConsole(int[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("[");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public static void printArrayToFile(int[][] array, String file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(file));
        for(int i = 0; i < array.length; i++){
            System.out.print("[");
            for(int j = 0; j < array[i].length; j++){
                writer.print(array[i][j] + " ");
            }
            System.out.println("]");

        }
        writer.close();
    }
    public static int sumArray(int[][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int findMax (int[][] array){
        int max = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int findMin (int[][] array){
        int min = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int[] findMinIndex (int[][] array){
        int min = array[0][0];
        int[] index = new int[2];
        int r = 0;
        int c = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                    r = i;
                    c = j;
                }
            }

        }
        index[0] = r;
        index[1] = c;
        return index;
    }

    public static int[] findMaxIndex (int[][] array){
        int max = array[0][0];
        int[] index = new int[2];
        int r = 0;
        int c = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        index[0] = r;
        index[1] = c;
        return index;
    }

    public static int[] findFirstIndex (int[][] array, int n){
        int[] index = {-1, -1};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == n){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[] findLastIndex (int[][] array, int n){
        int[] index = {-1, -1};
        for(int i = array.length -1; i >= 0; i--){
            for(int j = array[i].length - 1; j >= 0 ; j--){
                if(array[i][j] == n){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[][] switchElement (int[][] array, int[] index1, int[] index2){
        int temp;
        temp = array[index1[0]][index1[1]];
        array[index1[0]][index1[1]] = array[index2[0]][index2[1]];
        array[index2[0]][index2[1]] = temp;
        return array;
    }
}
