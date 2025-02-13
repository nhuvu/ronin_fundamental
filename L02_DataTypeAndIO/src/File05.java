import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/L02/Person_read.txt"));
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        float height = scanner.nextFloat();
        System.out.printf("Read person info: %s, %d, %.2fm", name, age, height);

        PrintWriter writer = new PrintWriter(new File("resources/L02/Person_write.txt"));
        writer.printf("Họ và tên: %s \nTuổi: %d \nChiều cao: %.2fm", name, age, height);
        writer.close();
    }
}
