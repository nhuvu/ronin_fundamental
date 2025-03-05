public class Ex10 {
    /**
     * Viết chương trình tính 20! % 2752
     *Input: Số 20
     *Output: Là kết quả của phép tính 20! % 2752 (2496)
     * */
    public static void main(String[] args) {
        long r = gt(20);
        System.out.println(r % 2752);
    }

    public static long gt(int n){
        if(n==0){
            return 1;
        }
        int n_1 = n - 1;
        return n * gt(n_1);
    }
}
