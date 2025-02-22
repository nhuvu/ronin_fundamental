import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW05 {
    /**
     * Viết chương trình đọc ra tất cả các số nguyên có trong một file và tính tổng tất cả các số nguyên đó,
     * kết quả ghi ra một file text khác.
     * */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/L05/HW05_read.txt"));
        //Số đầu tiên trong file là số phần tử của mảng
        int numOfElements = scanner.nextInt();
        int[] array = new int[numOfElements];
        int index = 0;
        int sum = 0;

        while (scanner.hasNextInt() && index < numOfElements){
            array[index] = scanner.nextInt();
            sum += array[index];
            index++;
        }
        scanner.close();

        PrintWriter writer = new PrintWriter(new File("resources/L05/HW05_write.txt"));
        for(int i = 0; i < array.length; i++){
            writer.printf("%d ", array[i]);
        }
        writer.println();
        writer.println("Tổng tất cả các số nguyên: " + sum);
        writer.close();
    }
}
