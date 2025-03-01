import java.util.Scanner;

public class Ex01 {
    /**
     * Cho mảng A[] gồm n phần tử, hãy đưa ra số nhỏ nhất và số nhỏ thứ hai của mảng.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cho mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập số: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int[] minArr = findTopTwoMin(array);
        System.out.printf("Số nhỏ nhất và số nhỏ thứ hai của mảng: %d & %d", minArr[0], minArr[1]);
    }

    public static int[] findTopTwoMin (int[] arr){
        int[] twoMin = new int[2];
        int min; int secondMin;
        if(arr.length < 2){
           twoMin[0] = arr[0];
           twoMin[1] = arr[0];
           return twoMin;
        }
        min = arr[0];
        secondMin = arr[1];
        for(int i = 2; i < arr.length; i++){
            if(arr[i] <= min){
                secondMin = min;
                min = arr[i];
            }else {
                if(arr[i] <= secondMin){
                    secondMin = arr[i];
                }
            }
        }
        twoMin[0] = min;
        twoMin[1] = secondMin;
        return twoMin;
    }
}
