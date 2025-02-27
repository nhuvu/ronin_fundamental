import java.util.Scanner;

public class Ex02 {
    /**
     * Cho mảng A[] gồm n phần tử đã được sắp xếp. Hãy đưa ra 1 nếu X có mặt trong mảng A[],
     * ngược lại đưa ra -1.
     * */
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số X cần tìm: ");
        int X = scanner.nextInt();
        scanner.close();

        System.out.println(binarySearch(array, X));
    }

    public static int binarySearch(int[]arr, int number){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (number < arr[mid]) {
                end = mid - 1;
            }else if(number > arr[mid]){
                start = mid + 1;
            }else {
                return 1;
            }
        }
        return -1;
    }
}
