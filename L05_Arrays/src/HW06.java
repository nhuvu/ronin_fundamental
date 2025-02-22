import java.util.Scanner;

public class HW06 {
    /**
     * Viết một chương trình kiểm tra một mảng một chiều có phải là một mảng đối xứng không,
     * nếu có in ra “YES", nếu không in ra “NO".
     * Biết một mảng đối xứng là một mảng đọc từ trái qua phải, đọc từ phải qua trái đều giống nhau.
     * Ví dụ một mảng đối xứng [1, 2, 3, 2, 1].
     * */
    public static void main(String[] args) {
        int[] array = input();
        if(checkSymetric(array)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static int[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cho mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập số: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
    public static boolean checkSymetric (int[] array){
        for(int i = 0; i < array.length / 2; i++){
            if(array[i] != array[array.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
