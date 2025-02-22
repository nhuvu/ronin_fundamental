import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW09 {
    /**
     * 9. Viết các hàm thao tác với mảng một chiều theo mô tả dưới đây và minh họa sử dụng các hàm đó
     * */
    public static void main(String[] args) throws FileNotFoundException {
        //1. Nhập vào mảng một chiều từ màn hình console.
        int[] matrixConsole = inputFromConsole();

        //2. Nhập vào mảng hai chiều từ File (tham số của hàm có truyền vào đường dẫn của file dạng String)
        int[] matrixFile = inputFromFile("resources/L09/HW09_readInput.txt");

        //3. Hiển thị các phần tử của mảng một chiều ra màn hình console
        System.out.println("Mảng đọc từ màn hình console: ");
        printArrayToConsole(matrixConsole);
        System.out.println();

        //4. Hiển thị các phần tử của mảng một chiều ra File (tham số của hàm có truyền vào đường dẫn của file dạng String)
        printArrayToFile(matrixFile, "resources/L09/HW09_writeOutput.txt");

        //5. Tính tổng các phần tử trong mảng một chiều
        System.out.println("Tổng các phần tử: " + sumArray(matrixConsole));

        //6. Tìm số lớn nhất có trong mảng một chiều
        System.out.println("Số lớn nhất trong mảng: " + findMax(matrixConsole));

        //7. Tìm số nhỏ nhất có trong mảng một chiều
        System.out.println("Số nhỏ nhất trong mảng: " + findMin(matrixConsole));

        //8. Tìm vị trí của phần tử nhỏ nhất trong mảng một chiều.
        System.out.println("Vị trí của phần tử nhỏ nhất: " + findMinIndex(matrixConsole));

        //9. Tìm vị trí của phần tử lớn nhất trong mảng một chiều.
        System.out.println("Vị trí của phần tử lớn nhất: " + findMaxIndex(matrixConsole));

        //10. Tìm vị trí của phần tử đầu tiên có giá trị bằng n. Nếu không có thì trả về -1
        System.out.printf("Vị trí của phần tử đầu tiên có giá trị bằng 5: %d \n", findFirstIndex(matrixConsole,5));

        //11. Tìm vị trí của phần tử cuối cùng có giá trị bằng n. Nếu không có thì trả về -1
        System.out.printf("Vị trí của phần tử cuối cùng có giá trị bằng 5: %d \n", findLastIndex(matrixConsole,5));

        //12. Hoán đổi giá trị của hai phần tử bất kỳ trong mảng. Tham số nhận vào hai vị trí của hai phần tử cần hoán đổi.
        System.out.println("Mảng sau khi hoán đổi giá trị vị trí thứ 2 & 4: ");
        printArrayToConsole(switchElement(matrixConsole, 1, 3));

    }
    public static int[] inputFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cho mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập số thứ %d: ", i+1);
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int[] inputFromFile(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        int count = 0;
        while (scanner.hasNextInt()){
            scanner.nextInt();
            count++;
        }
        scanner.close();
        int[] matrix = new int[count];
        scanner = new Scanner(new File(file));
        for(int i = 0; i < count; i++){
            matrix[i] = scanner.nextInt();
        }
        scanner.close();
        return matrix;
    }

    public static void printArrayToConsole(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void printArrayToFile(int[] array, String file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(file));
        for(int i = 0; i < array.length; i++){
            writer.print(array[i] + " ");
        }
        writer.close();
    }
    public static int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static int findMax (int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int findMin (int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int findMinIndex (int[] array){
        int min = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index + 1;
    }
    public static int findMaxIndex (int[] array){
        int max = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index + 1;
    }
    public static int findFirstIndex (int[] array, int n){
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return i + 1;
            }
        }
        return -1;
    }
    public static int findLastIndex (int[] array, int n){
        for(int i = array.length - 1; i >= 0; i--){
            if(array[i] == n){
                return i + 1;
            }
        }
        return -1;
    }
    public static int[] switchElement (int[] array, int index1, int index2){
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

}
