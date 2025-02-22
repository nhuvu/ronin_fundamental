import java.util.Scanner;

public class HW07 {
    /**
     * Cho dãy số A[] gồm có N phần tử. Nhiệm vụ của bạn là hãy tìm số xuất hiện nhiều hơn 1 lần trong dãy số và số thứ tự là nhỏ nhất.
     * Ví dụ: Input; 10 5 3 4 3 5 6 ⇒ Output là 5 vì có 5 và 3 đều xuất hiện 2 lần, nhưng số 5 có số thứ tự nhỏ hơn,
     * input: 1 2 3 4 ⇒ NO.
     * */
    public static void main(String[] args) {
        int[] array = input();
        System.out.println(findFirstDuplicateElement(array));
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

    public static String findFirstDuplicateElement (int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i] == array[j] && i != j){
                    return "Số đầu tiên xuất hiện nhiều hơn 1 lần trong dãy: " + array[i];
                }
            }
        }
        return "NO";
    }
}
