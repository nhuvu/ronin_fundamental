import java.util.Scanner;

public class HW01 {
    /**
     * Cho dãy số A[] gồm có N số nguyên dương x (0 <= x <= 20).
     * Nhiệm vụ của bạn là hãy sắp xếp dãy số này theo tần suất xuất hiện của chúng.
     * Số nào có số lần xuất hiện lớn hơn in ra trước.
     * Nếu có 2 số có số lần xuất hiện bằng nhau, số nào xuất hiện trong dãy A[] trước sẽ được in ra trước.
     * Ví dụ {2 5 2 8 5 6 8 8} ⇒ Kết quả:  {8 8 8 2 2 5 5 6}
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

        //Tìm max & min
        int max = findMax(array);
        int min = findMin(array);
        int[] freq = new int[max - min+1];
        for(int num : array){
            freq[num - min]++;
        }

        //Sort array
        sortByFrequency(array, freq, min);
        //In mảng đã sort
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int findMax (int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void sortByFrequency (int[] arr, int[] freq, int min){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                int freq1 = freq[arr[j] - min];
                int freq2 = freq[arr[j + 1] - min];

                if (freq1 < freq2) {
                    // Swap if left element has a lower frequency
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
