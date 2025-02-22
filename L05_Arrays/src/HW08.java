import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class HW08 {
    /**
     * Đọc trong một file các số nguyên dương với số lượng không biết trước.
     * Hãy tìm các số chỉ bao gồm các chữ số nguyên tố và đếm số lần xuất hiện của các số đó.
     * */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/L05/HW08_read.txt"));
        String[] matrix = new String[1000];
        int index = 0;
        while (scanner.hasNext() && index < matrix.length){
            matrix[index] = scanner.next();
            index++;
        }
        scanner.close();
        boolean[] visited = new boolean[index];
        for(int i = 0; i < index; i++){
            if(containsOnlyPrime(matrix[i])){
                if(visited[i]) continue;

                int count = 1;
                for(int j = i+1; j < index; j++){
                    if(matrix[i].equals(matrix[j])){
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.printf("%s %d \n", matrix[i], count);
            }
        }
    }

    public static boolean containsOnlyPrime (String s){
        for(int i = 0; i < s.length(); i++){
            int number = Character.getNumericValue(s.charAt(i));
            if(!checkPrime(number)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPrime (int i){
        if(i == 1){
            return false;
        }
        for(int j = 2; j <= i/2; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
