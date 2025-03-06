public class Exam11 {
    /**
     * Cho số nguyên dương N. Nhiệm vụ của bạn là hãy xác định xem có bao nhiêu ước số của N chia hết cho 3.
     *Input: N = 972
     *Output: Số lượng các ước số của n chia hết cho 3 (15)
     * */
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 972; i++){
            if(972 % i == 0 && i % 3 == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }

}
