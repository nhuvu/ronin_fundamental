import java.util.Scanner;

public class HW02 {
    /**
     * Cho mảng A[] gồm n số nguyên khác nhau.
     * Hãy đưa ra các phần tử của mảng theo khuôn dạng lớn nhất, nhỏ nhất, lớn thứ hai, nhỏ thứ 2,…
     * Ví dụ với A[] = {9, 7, 12, 8, 6, 5} ta đưa ra: 12, 5, 9, 6, 8, 7.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            array[i] = scanner.nextInt();
        }
        scanner.close();

        //Sort array
        insertionSort(array);
        //In array đã sort theo yêu cầu
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < array.length ; i++) {
            if(i == array.length - 1 - i){
                System.out.print(array[i] + " ");
            } else if(i < array.length - 1 - i){
                System.out.print(array[array.length - 1 - i] + " ");
                System.out.print(array[i] + " ");
            }else break;
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            int j;
            for (j = i - 1; j >= 0; j--) {
                if (current < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = current;
        }
    }
}
