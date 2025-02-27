import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chiếc gậy: ");
        int n = scanner.nextInt();
        int[] sticks = new int[n];
        int[] covers = new int[n];
        for (int i = 0; i < sticks.length; i++) {
            System.out.printf("Nhập độ dài chiếc gậy thứ %d: ", i + 1);
            sticks[i] = scanner.nextInt();
        }
        for (int i = 0; i < covers.length; i++) {
            System.out.printf("Nhập độ dài hộp phép thứ %d: ", i + 1);
            covers[i] = scanner.nextInt();
        }
        scanner.close();

        //sort 2 array
        bubbleSort(sticks);
        bubbleSort(covers);
        //loop số hộp, tất cả hộp đều thỏa mãn thì true, ko thì false
        boolean b = true;
        for(int i = 0; i < covers.length; i++){
            if(!coverCanHandleStick(sticks, covers, i+1)){
                b = false;
                break;
            }
        }
        System.out.println(b ? "YES" : "NO");
    }

    //Để đảm bảo đủ hộp cho số gậy thì hộp có độ dài thứ i phải chứa được i gậy
    // (vd: hộp thứ 1 phải >= độ dài 1 gậy, hộp thứ 2 phải >= độ dài 2 gậy)
    public static boolean coverCanHandleStick(int[] sticks, int[] covers, int idxOfCover){
        for(int i = 0; i < idxOfCover; i++){
            if(covers[i] < sticks[i]){
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] arr){
        int end = arr.length - 1;
        while (true){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
            end--;
            if(end == 0){
                return;
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
