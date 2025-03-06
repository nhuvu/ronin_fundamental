public class Exam09 {
    /**
     * Viết chương trình tính sắp xếp mảng arr theo thứ tự từ nhỏ đến lớn.
     *Input: Mảng long[] arr = {906393690836908L, 906393690836906L, 906393690836900L, ... 906393690836908L};
     *Output: In ra giá trị của phần tử có index = 23 của mảng arr sau khi sắp xếp (Không có chữ L ở cuối). (906393690836908)
     * */
    public static void main(String[] args) {
        long[] arr = {906393690836908L, 906393690836906L, 906393690836900L, 906393680836908L,
                906393660836908L, 906393990836908L, 906393690836909L, 906383690836908L, 906393600836908L,
                906393600836906L, 906393600836900L, 906393680836900L, 906393660836900L, 906393990836900L,
                906393690836903L, 906393390836908L, 906393390836906L, 906393390836900L, 906393380836908L,
                906393360836908L, 906393690806908L, 906393690836908L, 906393690836908L, 906393690836908L,
                906393690836908L, 906393690836908L, 906393690836908L, 906393690836908L, 906393690836908L, 906393690836908L};
        bubbleSort(arr);

        System.out.println(arr[23]);
    }

    public static void bubbleSort(long[] arr){
        int end = arr.length - 1;
        while (true){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
            end--;
            if(end == 0){
                break;
            }
        }
    }

    public static void swap(long[] arr, int i, int j){
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


