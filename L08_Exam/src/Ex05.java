public class Ex05 {
    /**
     * Viết chương trình tính (5^12) % 2752
     *
     * Input: Số 5 và 12
     *Output: Là kết quả của phép tính (5^12) % 2752 (2449)
     * */
    public static void main(String[] args) {
        int k = 5;
        int sum = 1;
        for(int i = 0; i < 12; i++){
            sum *= k;
        }
        System.out.println(sum % 2752);
    }

}
