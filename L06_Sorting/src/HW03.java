import java.util.Scanner;

public class HW03 {
    /**
     * Cho mảng A[] gồm n số nguyên dương < 100.
     * Gọi L, R là max và min các phần tử của A[].
     * Nhiệm vụ của bạn là tìm số phần tử cần thiết cần thêm vào mảng để mảng có đầy đủ các số trong khoảng [L, R].
     * Ví dụ A[] = {5, 7, 9, 3, 6, 2} ta nhận được kết quả là 2 tương ứng với các số còn thiếu là 4, 8.
     * */
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

        //sort array
        bubbleSort(array);
        //loop array to find missing numbers
        int missingCount = 0;
        int min = array[0];
        int max = array[array.length-1];
        int current = min + 1;

        while (current < max){
            if(!isExist(array, current)){
                missingCount++;
            }
            current++;
        }
        System.out.println("Số phần tử còn thiếu: " + missingCount);

    }

    public static boolean isExist(int[] array, int a){
        for(int i = 0; i < array.length; i++){
            if(a == array[i]){
                return true;
            }
        }
        return false;
    }

    public static void bubbleSort (int[] array){
        int length = array.length - 1;
        while (true){
            for(int i = 0; i < length; i++){
                if (array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
            length--;
            if(length == 0){
                return;
            }
        }

    }

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
