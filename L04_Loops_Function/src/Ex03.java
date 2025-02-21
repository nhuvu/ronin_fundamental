import java.util.Scanner;

public class Ex03 {
    /**
     * Viết một chương trình cho phép người dùng nhập vào số lượng học sinh trong một lớp học (>= 2),
     * họ tên, điểm số của từng sinh viên trong lớp.
     * Hãy in ra tên của sinh viên có điểm số cao nhất và sinh viên có điểm số cao thứ hai.
     * */
    public static void main(String[] args) {
        int numStudents;
        String nameOfHighestPoint = null;
        String nameOfSecondHighestPoint = null;
        float highestPoint = 0.0f;
        float secondHighestPoint = 0.0f;
        
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập số lượng sinh viên: ");
            numStudents = scanner.nextInt();
            if(numStudents >= 2){
                break;
            }
        }
        for(int i = 0; i < numStudents; i++){
            System.out.printf("Nhập tên sinh viên thứ %d: \n", i+1);
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.printf("Nhập điểm sinh viên thứ %d: \n", i+1);
            float point = scanner.nextFloat();
            if(point >= highestPoint){
                secondHighestPoint = highestPoint;
                highestPoint = point;
                nameOfSecondHighestPoint = nameOfHighestPoint;
                nameOfHighestPoint = name;
            }else {
                if(point > secondHighestPoint){
                    secondHighestPoint = point;
                    nameOfSecondHighestPoint = name;
                }
            }
        }
        scanner.close();
        System.out.printf("Tên sinh viên điểm cao nhất là: %s \n", nameOfHighestPoint);
        System.out.printf("Tên sinh viên điểm cao thứ hai là: %s", nameOfSecondHighestPoint);

    }
}
