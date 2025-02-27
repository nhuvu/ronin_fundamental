import java.util.Scanner;

public class HW04 {
    /**
     * Cho mảng A[] gồm N số nguyên không âm và số K.
     * Nhiệm vụ của bạn là hãy chia mảng A[] thành hai mảng con có kích cỡ K và N-K
     * sao cho hiệu giữa tổng hai mảng con là lớn nhất.
     * Ví dụ với mảng A[] = {8, 4, 5, 2, 10}, K=2 ta có kết quả là 17
     * vì mảng A[] được chia thành hai mảng {4,2} và {8,5,10} có hiệu của hai mảng con là 23 - 6 = 17 là lớn nhất.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            array[i] = scanner.nextInt();
        }
        int k;
        while (true){
            System.out.println("Nhập số k để chia mảng (k < n): ");
             k = scanner.nextInt();
            if(k < n){
                break;
            }
        }
        scanner.close();

        //sort array
        selectionSort(array);

        //tạo 2 mảng con với length = k & n - k
        int[] arr1 = new int[k];
        int[] arr2 = new int[n-k];
        putEleToSubArray(array, arr1, arr2);

        //Tính hiệu 2 mảng
        int diff = Math.abs(sumArray(arr1) - sumArray(arr2));
        System.out.println("Hiệu của hai mảng con: " + diff);
    }

    public static void putEleToSubArray(int[] array, int[] arr1, int[] arr2){
        //so sánh length 2 mảng, ưu tiên bỏ các phần tử nhỏ nhất trong mảng cha vào mảng con có length nhỏ
        if(arr1.length <= arr2.length){
            for(int i = 0; i < arr1.length; i++){
                arr1[i] = array[i];
            }
            for(int j = 0; j < arr2.length; j++){
                arr2[j] = array[j + arr1.length];
            }
        }else {
            for(int i = 0; i < arr2.length; i++){
                arr2[i] = array[i];
            }
            for(int j = 0; j < arr1.length; j++){
                arr1[j] = array[j + arr2.length];
            }
        }
    }

    public static int sumArray (int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int minIdx = findMinIndex(array, i, array.length-1);
            swap(array, i, minIdx);
        }
    }

    public static int findMinIndex (int[] arr, int start, int end){
        int min = arr[start];
        int minIdx = start;
        for(int i = start+1; i <= end; i++){
            if(arr[i] < min){
                min = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
